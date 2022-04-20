<template>
    <div class="Contador_1">
      {{$store.state.contador}} <sup>2</sup> = {{ $store.getters.cuadrado}}
    </div>
</template>
<script>
export default{
    name: "Contador_1"
}
</script>