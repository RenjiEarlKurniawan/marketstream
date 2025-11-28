package com.ecommerce.marketstream.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name = "product_category")
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {

    @EmbeddedId
    private ProductCategoryId id;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Embeddable
    public static class ProductCategoryId{
        @Column(name = "product_id")
        private Long productId;
        @Column(name = "category_id")
        private Long categoryId;
    }
}
