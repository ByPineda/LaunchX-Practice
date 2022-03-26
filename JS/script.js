const pokeMOVES = document.getElementById("pokeMOVES");
function fetchPokemon() {
    const pokeName = document.getElementById("pokeINPUT");
    
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
        //REGULAR INFO
        let pokeImg = data.sprites.front_default;
        let pokeNAME = data.name;
        let pokeID = data.id;
        let pokeTYPE = data.types[0].type.name;
        let pokeWEIGHT = data.weight; let pokeHEIGHT = data.height;
        //STATS
        let HP = data.stats[0].base_stat;
        let ATK = data.stats[1].base_stat;
        let DEF = data.stats[2].base_stat;
        let STAK = data.stats[3].base_stat;
        let SDEF = data.stats[4].base_stat;
        let SPD = data.stats[5].base_stat;
        //MOVES
        let pokeMOVES = data.moves;
        pokeImage(pokeImg);
        pokeINFO(pokeNAME, pokeID, pokeTYPE, pokeWEIGHT, pokeHEIGHT, HP ,ATK, DEF,STAK,SDEF,SPD);
        MOVES(pokeMOVES);
        
    })

}
function pokeImage(url) {
    const pokeIMG = document.getElementById("pokeIMG");
    pokeIMG.src = url;
}

function pokeINFO(NAME, PokeID, PokeTYPE, weight, height, HP, ATK, DEF,STAK,SDEF,SPD){

    NAME = capitalize(NAME);
    document.getElementById("pokeNAME").innerHTML = `${ NAME}`;
    document.getElementById("numID").innerHTML = `${ PokeID}`;
    PokeTYPE = capitalize(PokeTYPE);
    document.getElementById("pokeTYPE").innerHTML = `${ PokeTYPE}`;
    document.getElementById("pokeWEIGHT").innerHTML = `${ weight}`;
    document.getElementById("pokeHEIGHT").innerHTML = `${ height}`; 
    //STATS  
    document.getElementById("pokeHP").innerHTML = `${ HP}`;
    document.getElementById("pokeATK").innerHTML = `${ ATK}`;
    document.getElementById("pokeDEF").innerHTML = `${ DEF}`;
    document.getElementById("pokeSATK").innerHTML = `${ STAK}`;
    document.getElementById("pokeSDEF").innerHTML = `${ SDEF}`;
    document.getElementById("pokeSPD").innerHTML = `${ SPD}`;

    

}

function MOVES(MOVES){
    pokeMOVES.innerHTML = ""
    console.log(MOVES.length);
    for(let i = 0; i < MOVES.length; i++){
        const element = document.createElement("li");
        console.log(element);
        pokeMOVES.appendChild(element);
        MOVES[i].move.name = capitalize(MOVES[i].move.name);
        element.innerText = MOVES[i].move.name;
        
    }

}

function capitalize(word) {
    return word[0].toUpperCase() + word.slice(1).toLowerCase();
  }

