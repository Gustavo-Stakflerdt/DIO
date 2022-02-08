namespace Abstracao_Jogo_RPG_em_C.src.Entities
{

    // classe abstrata Hero
    public abstract class Hero
    {
        // construtor com as características
        public Hero(string Name, int Level, string HeroType){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;

        }

        // construtor vazio
        public Hero(){

        }

        // para poder usar os objetos
        public string Name;
        public int Level;
        public string HeroType;

        // sobrescreve o comportamento padrão com uma mensagem
        public override string ToString(){
            return this.Name + " " + this.Level + " " + this.HeroType;
        }
        
        // método de ataque 
        public virtual string Attack(){
            return this.Name + " Atacou com a sua espada.";
        }


    }
}