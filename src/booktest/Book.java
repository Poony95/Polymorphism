package booktest;

import java.util.Objects;

// 책을 대여하고 연체료를 포함하여 도서대출 프로그램을 만들고자 한다.
// 각각의 책들은 종류마다 연체료가 다르다.(도서번호로 종류를 나눔)
// 도서번호, 도서제목, 작가의 이름을 포함하여 프로그램을 작성하라.
public abstract class Book {

	protected int number;
	protected String title;
	protected String author;
	
	public abstract int getLateFees(int days);
	
	public Book() {
		super();
	}
	public Book(int number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return number == other.number;
	}
}
