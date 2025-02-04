package com.epam.training.iaroslav_bulimov.module_14;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        long anotherShor = 0b10000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
        switch (shot.charAt(0)) {
            case 'A': break;
            case 'B': {
                anotherShor >>>= 1;
                break;
            }
            case 'C': {
                anotherShor >>>= 2;
                break;
            }
            case 'D': {
                anotherShor >>>= 3;
                break;
            }
            case 'E': {
                anotherShor >>>= 4;
                break;
            }
            case 'F': {
                anotherShor >>>= 5;
                break;
            }
            case 'G': {
                anotherShor >>>= 6;
                break;
            }
            case 'H': {
                anotherShor >>>= 7;
                break;
            }
        }
        anotherShor >>>= (8 * (shot.charAt(1) - 1));
        shots |= anotherShor;
        if (ships == (ships | anotherShor)) {
            return true;
        }
        return false;
    }

    public String state() {
        String strShips = Long.toBinaryString(ships);
        String strShots = Long.toBinaryString(shots);
        StringBuilder bufZeros = new StringBuilder();
        if (strShots.length() < 64) {
            for (int i = 0; i < 64 - strShots.length(); i++)
                bufZeros.append("0");
            strShots = bufZeros.append(strShots).toString();
            bufZeros.delete(0, bufZeros.length());
        }
        if (strShips.length() < 64) {
            for (int i = 0; i < 64 - strShips.length(); i++)
                bufZeros.append("0");
            strShips = bufZeros.append(strShips).toString();
            bufZeros.delete(0, bufZeros.length());
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strShots.length(); i++) {
            if (i%8 == 0)
                result.append("\n");
            if (strShips.charAt(i) == '0' && strShots.charAt(i) == '0')
                result.append(".");
            if (strShips.charAt(i) == '0' && strShots.charAt(i) == '1')
                result.append("×");
            if (strShips.charAt(i) == '1' && strShots.charAt(i) == '0')
                result.append("☐");
            if (strShips.charAt(i) == '1' && strShots.charAt(i) == '1')
                result.append("☒");
        }
        return result.toString();
    }
}

