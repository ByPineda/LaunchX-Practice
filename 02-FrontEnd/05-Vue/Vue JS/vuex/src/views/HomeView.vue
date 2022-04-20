<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <div class="count">
      {{$store.state.contador}}
    </div>
    <Contador_1/>
    <div class="buttons">
      <button @click="$store.commit('bajarContador')">-</button>
      <button @click="$store.dispatch('subirContador')">+</button>
    </div>
  </div>
</template>

<script>
import Contador_1 from "../components/Contador.vue";
export default {
  name: 'HomeView',
  components:{
    Contador_1,
  }
}
</script>

<style >
  .count{
    font-size: 110px;
  }
  div{
    margin-bottom: 10px;
  }
  button {
    width: 30px;
    height: 30px;
  }
</style>