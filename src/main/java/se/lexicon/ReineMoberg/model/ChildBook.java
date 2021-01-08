package se.lexicon.ReineMoberg.model;


public class ChildBook extends Book {

    public static ChildBook[] childBooks = new ChildBook[2];

    public ChildBook() {
    }

    public ChildBook(int pages) {
        super(pages);
    }

    public ChildBook[] getChildBooks(){
        return childBooks;
    }

    @Override
    public String toString() {
        return "ChildBook{} " + super.toString();
    }
}
