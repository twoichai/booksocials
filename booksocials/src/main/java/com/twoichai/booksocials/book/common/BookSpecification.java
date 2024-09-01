package com.twoichai.booksocials.book.common;

import com.twoichai.booksocials.book.Book;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;

@Getter
@Setter
public class BookSpecification {

    public static Specification<Book> withOwner(Integer ownerId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("owner").get("id"), ownerId);
    }
}
