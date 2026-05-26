package org.commonmark.node;

/**
 * A fenced code block, e.g.:
 * <pre>
 * ```
 * foo
 * bar
 * ```
 * </pre>
 * <p>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#fenced-code-blocks">CommonMark Spec</a>
 */
public class FencedCodeBlock extends Block {

    private String fenceCharacter;

    private Integer openingFenceLength;

    private Integer closingFenceLength;

    private int fenceIndent;

    private String info;

    private String literal;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the fence character that was used, e.g. {@code `} or {@code ~}, if available, or null otherwise
     */
    public String getFenceCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFenceCharacter(String fenceCharacter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the length of the opening fence (how many of {{@link #getFenceCharacter()}} were used to start the code
     * block) if available, or null otherwise
     */
    public Integer getOpeningFenceLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOpeningFenceLength(Integer openingFenceLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the length of the closing fence (how many of {@link #getFenceCharacter()} were used to end the code
     * block) if available, or null otherwise
     */
    public Integer getClosingFenceLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setClosingFenceLength(Integer closingFenceLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getFenceIndent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFenceIndent(int fenceIndent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @see <a href="http://spec.commonmark.org/0.31.2/#info-string">CommonMark spec</a>
     */
    public String getInfo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setInfo(String info) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLiteral() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLiteral(String literal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated use {@link #getFenceCharacter()} instead
     */
    @Deprecated
    public char getFenceChar() {
        return fenceCharacter != null && !fenceCharacter.isEmpty() ? fenceCharacter.charAt(0) : '\0';
    }

    /**
     * @deprecated use {@link #setFenceCharacter} instead
     */
    @Deprecated
    public void setFenceChar(char fenceChar) {
        this.fenceCharacter = fenceChar != '\0' ? String.valueOf(fenceChar) : null;
    }

    /**
     * @deprecated use {@link #getOpeningFenceLength} instead
     */
    @Deprecated
    public int getFenceLength() {
        return openingFenceLength != null ? openingFenceLength : 0;
    }

    /**
     * @deprecated use {@link #setOpeningFenceLength} instead
     */
    @Deprecated
    public void setFenceLength(int fenceLength) {
        this.openingFenceLength = fenceLength != 0 ? fenceLength : null;
    }

    private static void checkFenceLengths(Integer openingFenceLength, Integer closingFenceLength) {
        if (openingFenceLength != null && closingFenceLength != null) {
            if (closingFenceLength < openingFenceLength) {
                throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
            }
        }
    }
}
