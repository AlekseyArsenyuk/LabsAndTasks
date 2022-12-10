package lab3;

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

class JImageDisplay extends JComponent
{
    /**
     * Экземпляр буферизованного изображения.
     * Управляет изображением, содержимое которого мы можем писать.
     */
    private BufferedImage displayImage;

    /**
     * Метод получения отображаемого изображения из другого класса.
     */
    public BufferedImage getImage() {
        return displayImage;
    }

    /**  Тип определяет, как цвета каждого пикселя будут
     *   представлены в изображении; значение TYPE_INT_RGB обозначает, что
     *   красные, зеленые и синие компоненты имеют по 8 битов, представленные в
     *   формате int в указанном порядке.
    */
    public JImageDisplay(int width, int height) {
        displayImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        /**
         * Вызваем метод setPreferredSize() родительского класса
         * с заданной шириной и высотой.
         */
        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension);

    }
    /**
     * Суперкласса paintComponent(g) вызывает так, что границы и
     * черты нарисованы правильно. Затем изображение втягивается в компонент.
     */
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(displayImage, 0, 0, displayImage.getWidth(),
                displayImage.getHeight(), null);
    }

    // Запись данных в изображение. Устанавливает чёрный цвет пикселей
    // Нигде не используется
//    public void clearImage() {}

    /**
     * Устанавливает пиксель определенного цвета.
     */
    public void drawPixel(int x, int y, int rgbColor)
    {
        displayImage.setRGB(x, y, rgbColor);
    }
}