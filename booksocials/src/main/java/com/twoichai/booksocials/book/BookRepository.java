package com.twoichai.booksocials.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Integer> {
}
