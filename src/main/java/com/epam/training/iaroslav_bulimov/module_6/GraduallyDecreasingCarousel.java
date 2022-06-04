package com.epam.training.iaroslav_bulimov.module_6;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new GraduallyDecreasingCarouselRun();
        }
        return null;
    }
}

class GraduallyDecreasingCarouselRun extends CarouselRun {
    int decrement = 1;

    @Override
    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            array[position] -= decrement;
            do {
                position++;
                if (position == array.length) {
                    decrement++;
                    position = 0;
                }
            } while ((array[position] <= 0) && !isFinished());
        }
        return beforeDecreasing;
    }
}

