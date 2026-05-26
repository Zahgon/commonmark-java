package org.commonmark.node;

/**
 * A list block like {@link BulletList} or {@link OrderedList}.
 */
public abstract class ListBlock extends Block {

    private boolean tight;

    /**
     * @return whether this list is tight or loose
     * @see <a href="https://spec.commonmark.org/0.31.2/#tight">CommonMark Spec for tight lists</a>
     */
    public boolean isTight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTight(boolean tight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
