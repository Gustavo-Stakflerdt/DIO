namespace Abstracao_Jogo_RPG_em_C.src.Entities
{
    public class Ninja : Hero
    {
        public Ninja(string Name, int Level, string HeroType)
        {
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
        }

        public override string Attack(){
             return this.Name + " Atacou com a sua Adaga.";
        }
    }
}
