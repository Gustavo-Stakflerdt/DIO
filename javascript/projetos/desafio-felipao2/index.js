let vitorias = 75
let derrotas = 15
let nivel = "";

definirRanking(vitorias, derrotas)

console.log(`O Herói tem de saldo de ${saldoVitorias} e está no nível de ${nivel}.`)

function definirRanking(qntVitorias, qntDerrotas){
    saldoVitorias = qntVitorias - qntDerrotas
    if (saldoVitorias < 10){
        nivel = "Ferro";
    } else if (saldoVitorias <= 20){
        nivel = "Bronze";
    } else if (saldoVitorias <= 50){
        nivel = "Prata";
    } else if (saldoVitorias <= 80){
        nivel = "Ouro";
    } else if (saldoVitorias <= 80){
        nivel = "Platina";
    } else if (saldoVitorias <= 90){
        nivel = "Ascendente";
    } else if (saldoVitorias <= 100){
        nivel = "Imortal";
    } else if (saldoVitorias > 100){
        nivel = "Radiante";
    }
}