namespace Abstracao_Jogo_RPG_em_C.src.Entities
{
    // classe público Ninja que herda a classe Hero
    public class Ninja : Hero
    {
        // construtor com as características
        public Ninja(string Name, int Level, string HeroType)
        {
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
        }

        // sobrescreve o comportamento padrão com uma mensagem
        public override string Attack(){
             return this.Name + " Atacou com a sua Adaga.";
        }
    }
}