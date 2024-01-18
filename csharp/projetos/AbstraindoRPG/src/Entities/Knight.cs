namespace Abstracao_Jogo_RPG_em_C.src.Entities
{
    public class Knight : Hero
    {
        public Knight(string Name, int Level, string HeroType){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
        }

        public override string Attack(){
        return this.Name + " Atacou com a sua lança";
        }

        public string Attack(int Bonus){

            if (Bonus > 6){
            return this.Name + " Ataque de lança super efetivo com Bonus de " + Bonus;
            }else{
                return this.Name + "Ataque de lança com força fraca com bonus de " + Bonus;
            }
        }
    }
}
