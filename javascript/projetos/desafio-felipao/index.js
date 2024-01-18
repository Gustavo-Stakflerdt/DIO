let nome = "Felipe";
let qntXp = 20000;
let nivel = "";

if (qntXp < 1000){
    nivel = "Ferro";
} else if (qntXp < 2000){
    nivel = "Bronze";
} else if (qntXp < 5000){
    nivel = "Prata";
} else if (qntXp < 7000){
    nivel = "Ouro";
} else if (qntXp < 8000){
    nivel = "Platina";
} else if (qntXp < 9000){
    nivel = "Ascendente";
} else if (qntXp < 10000){
    nivel = "Imortal";
} else if (qntXp >= 10000){
    nivel = "Radiante";
}

console.log(`O Herói de nome ${nome} está no nível de ${nivel}.`)