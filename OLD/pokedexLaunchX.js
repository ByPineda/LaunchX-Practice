console.log("Hola Explorers");

function fetchPokemon() {
    const pokeName = document.getElementById("pokeName");
    let  pokeIN = pokeName.value.toLowerCase();
    const url = `https://pokeapi.co/api/v2/pokemon/${ pokeIN}`;
    fetch(url).then((res) => {
        if(res.status != 200){
            console.log(res);
        }
        return res.json();
    }).then((data) => {
        console.log(data);
        console.log("\n****************************\n");
        let pokeImg = data.sprites.front_default;
        pokeImage(pokeImg);
    })

    //RECIBIMOS UNA PROMESA...
    //Una promesa es la "promesa" de recepción de datos.
}

fetchPokemon();
/*
function imprimir(){
    const pokeName = document.getElementById("pokeName");
    let  pokeIN = pokeName.value;

    console.log("Hola explorers." + pokeIN );
}
*/
function pokeImage(url) {
    const pokeIMG = document.getElementById("pokeIMG");
    pokeIMG.src = url;
}

