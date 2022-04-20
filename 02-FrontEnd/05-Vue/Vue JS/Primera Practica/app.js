const app = Vue.createApp({
    data() {
        return {
            primerNombre: "Alex",
            apellido:     "Pineda",
            email:        "alex@innovaccionvirtual.mx",
            genero:       "male",
            foto:         "https://randomuser.me/api/portraits/men/13.jpg"
        }
    },
    methods: {
        imprimirNombre() {
            console.log(this.primerNombre);
        },
        async cambiarUsuario(){
            const resultado = await fetch("https://randomuser.me/api/");
            const {results} = await resultado.json();
            console.log(results);
            this.primerNombre = results[0].name.first;
            this.apellido=     results[0].name.last;
            this.email=        results[0].email;
            this.genero=       results[0].gender;
            this.foto=         results[0].picture.large;
            console.log(this.primerNombre);
        },
        
    }
})
app.mount("#app");