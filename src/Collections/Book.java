package Collections;
    public class Book {
        private int id;
        private String name;
        private String autherName;
        private int price;


        // Getters and Setters
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAutherName() {
            return autherName;
        }
        public void setAutherName(String autherName) {
            this.autherName = autherName;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }


        // Parameterized Constructors..
        public Book(int id, String name, String autherName, int price) {
            super();
            this.id = id;
            this.name = name;
            this.autherName = autherName;
            this.price = price;
        }

        public Book() {
            super();
        }

        // The to String Method
        @Override
        public String toString() {
            return "Book [id=" + id + ", name=" + name + ", autherName=" + autherName + ", price=" + price + "]";
        }



    }

