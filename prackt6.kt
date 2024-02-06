import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.abs
fun main()
{
    try {
        println ("Задание 1 (см2, вар. 8)")
        print("Введите трёхзначное число: ")
        var x = readLine()!!.toInt()
        print("Введите число: ")
        var a = readLine()!!.toInt()
        when (x)
        {
            in 100..999 ->
            {
                val x1 = x / 100
                val x2 = (x / 10) % 10
                val x3 = x % 10
                val mul = x1 * x2 * x3
                if (mul % a == 0)
                    println("Произведение цифр числа $x кратно числу $a")
                 else println("Произведение цифр числа $x не кратно числу $a")
            }
            else -> println("Число $x не трёхзначное")
        }

    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

    try {
    println ("\nЗадание 2 (см3, вар. 8)")
    print("Введите вес риса в 1-м мешке: ")
    var fbag = readLine()!!.toDouble()
    if (fbag>0)
    {
        print("Введите вес риса в 2-м мешке: ")
        var sbag = readLine()!!.toDouble()
        if (sbag>0)
        {
        when
        {
            fbag>sbag -> println("Первый мешок тяжелее")
            sbag>fbag -> println("Второй мешок тяжелее")
            else -> println("Вес мешков одинаковый")
        }
        }
        else println ("Вес был введён не корректно")
    }
    else println ("Вес был введён не корректно")

    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}