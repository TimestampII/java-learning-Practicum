import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParcelBoxTest {
    // Стандартный сценарий: добавление посылки, вес не превышен
    @Test
    public void shouldAddParcelWhenWeightNotExceeded() {
        ParcelBox<StandardParcel> box = new ParcelBox<>(10);
        StandardParcel parcel = new StandardParcel("Книга", 5, "Москва", 1);

        assertTrue(box.addParcel(parcel));
        assertEquals(1, box.getAllParcels().size());
        assertEquals(5, box.getCurrentWeight());
    }

    // Стандартный сценарий: добавление посылки, вес превышен
    @Test
    public void shouldNotAddParcelWhenWeightExceeded() {
        ParcelBox<StandardParcel> box = new ParcelBox<>(10);
        StandardParcel parcel = new StandardParcel("Тяжелые книги", 15, "Москва", 1);

        assertFalse(box.addParcel(parcel));
        assertEquals(0, box.getAllParcels().size());
        assertEquals(0, box.getCurrentWeight());
    }

    // Граничный сценарий: добавление посылки с весом, равным максимальному
    @Test
    public void shouldAddParcelWhenWeightEqualsMax() {
        ParcelBox<StandardParcel> box = new ParcelBox<>(10);
        StandardParcel parcel = new StandardParcel("Посылка", 10, "Москва", 1);

        assertTrue(box.addParcel(parcel));
        assertEquals(1, box.getAllParcels().size());
        assertEquals(10, box.getCurrentWeight());
    }

    // Дополнительный тест: попытка добавить посылку, когда коробка уже заполнена
    @Test
    public void shouldNotAddParcelWhenBoxIsFull() {
        ParcelBox<StandardParcel> box = new ParcelBox<>(10);
        StandardParcel parcel1 = new StandardParcel("Посылка 1", 7, "Москва", 1);
        StandardParcel parcel2 = new StandardParcel("Посылка 2", 5, "Москва", 1);

        assertTrue(box.addParcel(parcel1));
        assertFalse(box.addParcel(parcel2)); // 7 + 5 = 12 > 10
        assertEquals(1, box.getAllParcels().size());
        assertEquals(7, box.getCurrentWeight());
    }
}