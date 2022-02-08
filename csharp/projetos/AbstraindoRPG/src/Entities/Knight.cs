namespace Abstracao_Jogo_RPG_em_C.src.Entities
{
    // classe público Knight que herda a classe Hero
    public class Knight : Hero
    {
        // construtor com as características
        public Knight(string Name, int Level, string HeroType){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
        }

        // sobrescreve o comportamento padrão com uma mensagem
        public override string Attack(){
        return this.Name + " Atacou com a sua lança";
        }

        // método de ataque com bônus
        public string Attack(int Bonus){

            // se o bônus for maior que 6 mostra uma mensagem, caso contrário mostra outra mensagem
            if (Bonus > 6){
            return this.Name + " Ataque de lança super efetivo com Bonus de " + Bonus;
            }else{
                return this.Name + "Ataque de lança com força fraca com bonus de " + Bonus;
            }
    }
}
}