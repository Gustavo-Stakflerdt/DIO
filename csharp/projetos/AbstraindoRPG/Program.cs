using System;
using Abstracao_Jogo_RPG_em_C.src.Entities;

namespace Abstracao_Jogo_RPG_em_C
{
    class Program
    {
        static void Main(string[] args)
        {
            Knight arus = new Knight("Arus", 23, "Knight");
            Wizard wizard = new Ninja("Jennica", 23, "White Wizard");

            Console.WriteLine(wizard.Attack(1));
            Console.WriteLine(wizard.Attack(7));
        }
    }
}
