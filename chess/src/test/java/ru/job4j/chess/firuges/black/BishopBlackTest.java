package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void truePosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell exp = bishopBlack.position();
        assertThat(exp, is(Cell.C1) );
    }

    @Test
    public void hasWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] out = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(out, is(expected));
    }

    @Test
    public void dontHasDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell position = bishopBlack.position();
        assertFalse(bishopBlack.isDiagonal(position, Cell.H1));
    }

    @Test
    public void hasCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell exp = bishopBlack.copy(Cell.D3).position();
        assertThat(exp, is(Cell.D3));
    }
}