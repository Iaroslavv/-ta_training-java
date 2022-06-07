package com.epam.training.iaroslav_bulimov.module_7;

public class CompleteByRequestTask implements Task {
    private boolean complete = false;
    private boolean flagComplete = false;

    @Override
    public void execute() {
        //throw new UnsupportedOperationException();
        complete = flagComplete;
    }

    @Override
    public boolean isFinished() {
        //throw new UnsupportedOperationException();
        return complete;
    }

    public void complete() {
        //throw new UnsupportedOperationException();
        flagComplete = true;
    }
}

