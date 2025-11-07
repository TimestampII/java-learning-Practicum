import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParcelTest {

    // Стандартный сценарий: стандартная посылка
    @Test
    public void shouldCalculateStandardParcelCost() {
        StandardParcel parcel = new StandardParcel("Книги", 5, "Москва, ул. Ленина 1", 1);
        assertEquals(10, parcel.calculateDeliveryCost()); // 5 кг * 2 = 10
    }

    // Стандартный сценарий: скоропортящаяся посылка
    @Test
    public void shouldCalculatePerishableParcelCost() {
        PerishableParcel parcel = new PerishableParcel("Торт", 3, "Санкт-Петербург", 1, 2);
        assertEquals(9, parcel.calculateDeliveryCost()); // 3 кг * 3 = 9
    }

    // Стандартный сценарий: хрупкая посылка
    @Test
    public void shouldCalculateFragileParcelCost() {
        FragileParcel parcel = new FragileParcel("Ваза", 2, "Казань", 1);
        assertEquals(8, parcel.calculateDeliveryCost()); // 2 кг * 4 = 8
    }

    // Граничный сценарий: посылка с нулевым весом
    @Test
    public void shouldCalculateCostForZeroWeight() {
        StandardParcel parcel = new StandardParcel("Письмо", 0, "Москва", 1);
        assertEquals(0, parcel.calculateDeliveryCost()); // 0 кг * 2 = 0
    }

    // Стандартный сценарий: посылка не испортилась
    @Test
    public void shouldNotExpireWhenWithinTimeToLive() {
        PerishableParcel parcel = new PerishableParcel("Фрукты", 3, "Москва", 5, 3);
        assertFalse(parcel.isExpired(7)); // день отправки 5 + срок годности 3 = 8, текущий день 7 < 8
    }

    // Стандартный сценарий: посылка испортилась
    @Test
    public void shouldExpireAfterTimeToLive() {
        PerishableParcel parcel = new PerishableParcel("Молоко", 2, "Москва", 5, 3);
        assertTrue(parcel.isExpired(9)); // день отправки 5 + срок годности 3 = 8, текущий день 9 > 8
    }

    // Граничный сценарий: проверка в последний день срока годности
    @Test
    public void shouldNotExpireOnExactLastDay() {
        PerishableParcel parcel = new PerishableParcel("Хлеб", 1, "Москва", 5, 3);
        assertFalse(parcel.isExpired(8)); // день отправки 5 + срок годности 3 = 8, текущий день 8 = 8
    }
}