public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByNameContaining(String name);
}
