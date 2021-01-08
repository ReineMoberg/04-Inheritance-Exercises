package se.lexicon.ReineMoberg.model;

public class TeenageBook extends Book{

    public static TeenageBook[] teenageBooks = new TeenageBook[2];

    public TeenageBook() {
    }

    public TeenageBook(int pages) {
        super(pages);
    }

    public TeenageBook[] getTeenageBooks(){
        return teenageBooks;
    }

    //Bad coding practice, can't bother with this right now
    public TeenageBook searchTeenageBook(String title){
        TeenageBook foundBook = new TeenageBook();
        for (TeenageBook teenageBook:teenageBooks){
            if (teenageBook.getTitle().equalsIgnoreCase(title)){
                foundBook = teenageBook;
                break;
            }else{
                foundBook.setTitle("Book does not exist");
            }

        }
        return foundBook;
    }

    @Override
    public String toString() {
        return "TeenageBook{} " + super.toString();
    }
}
