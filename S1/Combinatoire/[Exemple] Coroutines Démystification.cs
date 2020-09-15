using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp1
{
    class AllPositiveIntegersIteratorFactory : IEnumerable<int>
    {
        public IEnumerator<int> GetEnumerator()
        {
            return new AllPositiveIntegersIterator();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }
    }


    class AllPositiveIntegersIterator : IEnumerator<int>
    {
        private int currentValue = -1;

        public bool MoveNext()
        {
            Console.WriteLine("MOVENEXT !!!");
            currentValue++;
            return true;
        }

        public void Reset()
        {
            currentValue = -1;
        }

        public int Current
        {
            get { return currentValue; }
        }

        object IEnumerator.Current => Current;

        public void Dispose()
        {
        }
    }


    class Program
    {
        public static IEnumerable PlayerBehaviour()
        {
            Console.WriteLine("Le joueur entre dans le donjon ...");
            yield return null;
            Console.WriteLine("Le joueur marche sur un rat et le rat couine !");
            yield return null;
            Console.WriteLine("Le joueur éclaire le fond de la grotte...");
            yield return null;
            Console.WriteLine("Le joueur est frappé de stuppeur à la découverte du monstre ...");
            yield return null;
        }
        
        public static IEnumerable MonsterBehaviour()
        {
            Console.WriteLine("Le monstre roupille ...");
            yield return null;
            Console.WriteLine("Le monstre se réveille ...");
            yield return null;
            Console.WriteLine("Le monstre rugit ");
            yield return null;
            Console.WriteLine("Le monstre bouffe le joueur !");
            yield return null;
        }
        
        
        
        
        
        
        static IEnumerable<int> AllPositiveNumbersMethod()
        {
            var currentValue = -1;

            while (true)
            {
                currentValue++;
                Console.WriteLine("Coucou");
                yield return currentValue;
            }
        }
        
        
        static void MyForEach<T>(IEnumerable<T> collection, Action<T> method)
        {
            var it = collection.GetEnumerator();

            while (it.MoveNext())
            {
                method(it.Current);
            }

            it.Dispose();
        }

        static void Main(string[] args)
        {
//            foreach (var elt in new AllPositiveIntegersIteratorFactory())
//            {
//                Console.WriteLine(elt);
//            }

//            var collec = AllPositiveNumbersMethod()
//                .Where(elt => elt % 2 == 0)
//                .Where(elt => elt % 3 == 0)
//                .Take(10);
//
//            Console.WriteLine("POUET !");
//            
//            MyForEach(collec,
//                elt =>
//                {
//                    Console.WriteLine(elt);
//                });
//
//            var behaviour = AllPositiveNumbersMethod().GetEnumerator();
//
//            behaviour.MoveNext();
//            behaviour.MoveNext();

            var playerBehaviour = PlayerBehaviour().GetEnumerator();
            var monsterBehaviour = MonsterBehaviour().GetEnumerator();

            var gameOver = false;

            while (!gameOver)
            {
                gameOver |= !playerBehaviour.MoveNext();
                gameOver |= !monsterBehaviour.MoveNext();
            }

        }
    }
}