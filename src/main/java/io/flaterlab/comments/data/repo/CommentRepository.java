package io.flaterlab.comments.models;

@Repository
public interface TableRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String text);
}