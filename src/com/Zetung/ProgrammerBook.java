package com.Zetung;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String language, int level){
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammerBook Pbook = (ProgrammerBook) o;
        return level == Pbook.level;
    }

    @Override
    public int hashCode(){
        return level;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{"
                + "language='" + language + '\''
                + ", level=" + level
                + '}';
    }
}
