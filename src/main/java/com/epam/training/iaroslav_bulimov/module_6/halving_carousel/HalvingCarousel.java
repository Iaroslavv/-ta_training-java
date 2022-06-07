package com.epam.training.iaroslav_bulimov.module_6.halving_carousel;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (getFlagRun() == 1) {
            return null;
        }
        setFlagRun((byte) 1);
        return new CarouselRun(getContainer(), getI(), 1);
    }
}

