package org.commonmark.ext.gfm.tables;

import org.commonmark.node.CustomNode;

/**
 * Table cell of a {@link TableRow} containing inline nodes.
 */
public class TableCell extends CustomNode {

    private boolean header;

    private Alignment alignment;

    private int width;

    /**
     * @return whether the cell is a header or not
     */
    public boolean isHeader() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHeader(boolean header) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the cell alignment or {@code null} if no specific alignment
     */
    public Alignment getAlignment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAlignment(Alignment alignment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the cell width (the number of dash and colon characters in the delimiter row of the table for this column)
     */
    public int getWidth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWidth(int width) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * How the cell is aligned horizontally.
     */
    public enum Alignment {

        LEFT, CENTER, RIGHT
    }
}
