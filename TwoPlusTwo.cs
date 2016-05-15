using System;

namespace TwoPlusTwo
{
    class Calc 
    {
        static void Main(string[] args)
        {
            var x = 2;
            var y = 2;

            if (1 == 0) ; // Works beacause of the semicolon after "if" statement
            {
             ++x;
            }

            Console.WriteLine(x + y);
        }
    }
}


