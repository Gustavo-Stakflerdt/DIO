class Heroi{
    constructor(nome, idade, tipo){
        this.nome = nome
        this.idade = idade
        this.tipo = tipo
    }

    atacar(){
        let ataque = ""
        if (this.tipo === "mago"){
            ataque = "magia"
        } else if (this.tipo === "guerreiro"){
            ataque = "espada"
        } else if (this.tipo === "monge"){
            ataque = "artes marciais"
        } else if (this.tipo === "ninja"){
            ataque = "shurikens"
        } else {
            ataque = "ataque desconhecido"
        }
        console.log(`${this.tipo} atacou usando ${ataque}`)
    }
}

let heroi = new Heroi("Guts", "25", "guerreiro")
heroi.atacar()
