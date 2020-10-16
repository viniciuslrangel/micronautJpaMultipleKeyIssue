package com.example.jpa

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.io.Serializable
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@IdClass(ExampleEntity.PK::class)
data class ExampleEntity(
        @Id
        val id1: Long,

        @Id
        val id2: String,

        @NotNull
        val randomField: String,

        val code: Int
) {
    @Embeddable
    data class PK(
            @NotNull
            @Column
            val id1: Long,

            @NotNull
            @Column
            val id2: String,
    ) : Serializable
}
