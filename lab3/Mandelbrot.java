package lab3;

import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator
{
    /**
     * Константа для количества максимальных итераций.
     */
    public static final int MAX_ITERATIONS = 3000;

    /**
     * метод позволяет генератору
     * фракталов определить наиболее «интересную» область комплексной плоскости
     * для конкретного фрактала. В качестве аргумента передается прямоугольный объект,
     * и метод должен изменить поля прямоугольника для отображения правильного начального диапазона для фрактала.
     */
    public void getInitialRange(Rectangle2D.Double range)
    {
        range.x = -2.5;
        range.y = -2;
        range.width = 4;
        range.height = 4;
    }

    /**
     * Этот метод реализует итерационную функцию для фрактала Мандельброта.
     * Константу с максимальным количеством итераций можно определить следующим образом:
     * public static final int MAX_ITERATIONS = 2000;
     */
    public int numIterations(double x, double y)
    {
        // Начинает итерации с нуля.
        int iteration = 0;
        // Инициализирует переменные zreal и zimaginary.
        double zreal = 0;
        double zimaginary = 0;

        /**
         * Вычисляем Zn = Zn-1 ^ 2 + c, где значения представляют собой комплексные числа, представленные
         * по zreal и zimaginary, Z0 = 0, а c - особая точка в
         * фрактал, который мы показываем (заданный x и y). Это повторяется
         * до Z ^ 2> 4 (абсолютное значение Z больше 2) или максимум
         * достигнуто количество итераций.
         */
        while (iteration < MAX_ITERATIONS &&
                zreal * zreal + zimaginary * zimaginary < 4)
        {
            double zrealUpdated = zreal * zreal - zimaginary * zimaginary + x;
            double zimaginaryUpdated = 2 * zreal * zimaginary + y;
            zreal = zrealUpdated;
            zimaginary = zimaginaryUpdated;
            iteration += 1;
        }

        /**
         * Если количество максимальных итераций достигнуто, возвращаем -1, чтобы
         * указать, что точка не вышла за границу.
         */
        if (iteration == MAX_ITERATIONS)
        {
            return -1;
        }

        return iteration;
    }

    /**
     * Реализация toString() в этой реализации фрактала. Возвращает
     * название фрактала: «Мандельброт».
     */
    public String toString() {
        return "Mandelbrot";
    }

}
