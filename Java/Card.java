class Card extends Payment {
    String email;
    int cvv;
    String date;

    public Card(Integer id, String email, int cvv, String date) {
        super(id);
        this.email = email;
        this.cvv = cvv;
        this.date = date;

    }
}
