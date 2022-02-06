package emlakOOP;

import emlakOOP.enums.*;
import emlakOOP.model.*;
import emlakOOP.model.advert.Advert;
import emlakOOP.model.advert.House;
import emlakOOP.model.advert.Plot;
import emlakOOP.model.advert.Workplace;

import java.util.ArrayList;
import java.util.List;

public class MockService {

    //mock records
    static List<User> users = new ArrayList<>();
    static List<Advert> adverts = new ArrayList<>();
    static List<Estate> estates = new ArrayList<>();
    static List<Attribute> attributes = new ArrayList<>();
    static List<Category> categories = new ArrayList<>();
    static List<Image> images = new ArrayList<>();
    static List<Search> searches = new ArrayList<>();
    static List<Address> addresses = new ArrayList<>();
    static List<Message> messages = new ArrayList<>();

    public static void generateMockData(){
        generateAttributes();
        generateCategories();
        generateAddresses();
        generateUsers();
        generateImages();
        generateAdverts();
        generateEstates();
        generateMessages();
        generateFavoriteEstates();
    }

    public static void generateAddresses(){
        addresses.add(
                new Address(
                        "İstanbul",
                        "Eyüp",
                        "Alibeyköy Mahallesi",
                        "Alibeyköy Mah. Ceylan Sk. No:8 D:6 Kat:3"
                )
        );
        addresses.add(
                new Address(
                        "İzmir",
                        "Buca",
                        "Cumhuriyet Mahallesi",
                        "1100/1 sk. No:4 D:1"
                )
        );
        addresses.add(
                new Address(
                        "İstanbul",
                        "Beşiktaş",
                        "Sinanpaşa Mahallesi",
                        "Abbasağa sk. No:6 D:4 Akay Apartmanı"
                )
        );
        addresses.add(
                new Address(
                        "İstanbul",
                        "Beşiktaş",
                        "Sinanpaşa Mahallesi",
                        "Abbasağa sk. No:5 D:3"
                )
        );
        addresses.add(
                new Address(
                        "İstanbul",
                        "Beşiktaş",
                        "Sinanpaşa Mahallesi",
                        "Abbasağa sk. No:4 D:2"
                )
        );
    }

    public static void generateUsers(){
        users.add(
                new User(
                        "Hatice",
                        "Dağlı",
                        "haticeetoglu03@gmail.com",
                        addresses.get(0),
                        "05349642224",
                        true
                )
        );
        users.add(
                new User(
                        "Ayşe",
                        "Sarı",
                        "ayse.sari@gmail.com",
                        addresses.get(1),
                        "05349642225",
                        false
                )
        );
    }

    public static void generateAttributes(){
        attributes.add(
                new Attribute(
                        AttributeType.INTERNAL_FEATURES,
                        "Halı Kaplama"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.INTERNAL_FEATURES,
                        "Hazır Mutfak"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.EXTERNAL_FEATURES,
                        "Asansör"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.EXTERNAL_FEATURES,
                        "Bahçeli"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.LOCATION,
                        "Arka Cepheli"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.LOCATION,
                        "Denize Sıfır"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.INFRASTRUCTURE,
                        "Doğalgaz Mevcut"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.INFRASTRUCTURE,
                        "Sanayi Elektriği"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.PURPOSE_OF_USAGE,
                        "Atölye"
                )
        );
        attributes.add(
                new Attribute(
                        AttributeType.PURPOSE_OF_USAGE,
                        "Depo"
                )
        );
    }

    public static void generateCategories(){
        categories.add(
                new Category(
                        AdvertType.HOUSE,
                        "Daire"
                )
        );
        categories.add(
                new Category(
                        AdvertType.HOUSE,
                        "Villa"
                )
        );
        categories.add(
                new Category(
                        AdvertType.WORKPLACE,
                        "Dükkan & Mağaza"
                )
        );
        categories.add(
                new Category(
                        AdvertType.WORKPLACE,
                        "Ofis"
                )
        );
        categories.add(
                new Category(
                        AdvertType.PLOT,
                        "Bağ"
                )
        );
        categories.add(
                new Category(
                        AdvertType.PLOT,
                        "Bahçe"
                )
        );
    }

    public static void generateImages(){
        images.add(
                new Image(
                        "ev1",
                        ".jpeg",
                        123
                )
        );
        images.add(
                new Image(
                        "işyeri2",
                        ".jpeg",
                        120
                )
        );
        images.add(
                new Image(
                        "arsa3",
                        ".jpeg",
                        98
                )
        );
    }

    public static void generateSearches(){
        searches.add(
                new Search(
                        users.get(0),
                        "il: İstanbul, Oda sayisi: 1",
                        true
                )
        );
        searches.add(
                new Search(
                        users.get(1),
                        "il: İzmir, Fiyat aralığı: [1000-5000]",
                        false
                )
        );
    }

    public static void generateAdverts(){
        adverts.add(
                new House(
                        categories.get(0),
                        addresses.get(2),
                        true,
                        true,
                        false,
                        new Price(6000, Currency.TL),
                        ReleaseType.SALE,
                        new ArrayList<>(List.of(images.get(0))),
                        3,
                        1,
                        1,
                        120,
                        110,
                        WarmingType.GAS_STOVE,
                        5,
                        3,
                        8,
                        HousingShape.APARTMENT,
                        false,
                        FuelType.NATURAL_GAS,
                        StructureType.STEEL,
                        State.SECOND_HAND,
                        UsingStatus.EMPTY,
                        new Price(200, Currency.TL),
                        true,
                        new ArrayList<>(List.of(Facade.WEST, Facade.SOUTH)),
                        DeedStatus.PLOT
                )
        );
        adverts.add(
                new House(
                        categories.get(1),
                        addresses.get(3),
                        true,
                        true,
                        false,
                        new Price(4000, Currency.TL),
                        ReleaseType.RENT,
                        new ArrayList<>(List.of(images.get(0))),
                        2,
                        1,
                        1,
                        90,
                        80,
                        WarmingType.CENTRAL,
                        1,
                        1,
                        3,
                        HousingShape.DUPLEX,
                        false,
                        FuelType.LIQUID_FUEL,
                        StructureType.PREFABRICATED,
                        State.FIRST_HAND,
                        UsingStatus.EMPTY,
                        new Price(400, Currency.TL),
                        true,
                        new ArrayList<>(List.of(Facade.EAST, Facade.SOUTH)),
                        DeedStatus.CONDOMINIUM
                )
        );
        adverts.add(
                new Plot(
                        categories.get(4),
                        addresses.get(4),
                        true,
                        true,
                        false,
                        new Price(3000, Currency.TL),
                        ReleaseType.SALE,
                        new ArrayList<>(List.of(images.get(2))),
                        300,
                        new Price(1000, Currency.TL),
                        "Beşiktaş Belediyesi",
                        4,
                        143,
                        1,
                        1
                )
        );
        adverts.add(
                new Workplace(
                        categories.get(2),
                        addresses.get(3),
                        true,
                        true,
                        true,
                        new Price(9000, Currency.TL),
                        ReleaseType.SALE,
                        new ArrayList<>(List.of(images.get(1))),
                        5,
                        200,
                        190,
                        30,
                        160,
                        1,
                        2,
                        false,
                        8,
                        3,
                        4,
                        WarmingType.NONE,
                        false,
                        FuelType.ELECTRIC,
                        State.SECOND_HAND,
                        UsingStatus.UNSPECIFIED,
                        DeedStatus.PLOT,
                        true,
                        new Price(1000, Currency.TL)
                )
        );
    }

    public static void generateEstates(){
        estates.add(
                new Estate(
                        "Öğretmenden Satılık 3+1",
                        "Kelepir fiyata aciliyetten satıyorum",
                        adverts.get(0),
                        users.get(0),
                        new Price(600000, Currency.TL),
                        true
                )
        );
        estates.add(
                new Estate(
                        "Beşiktaşta 2+1 Manzaralı",
                        "Borcum var acil satıyorum",
                        adverts.get(1),
                        users.get(0),
                        new Price(4000, Currency.TL),
                        true
                )
        );
        estates.add(
                new Estate(
                        "Abbasağada 300 m2 inşaata uygun",
                        "Konumu merkezidir. 10dk yürüme mesafesinde beşiktaş çarşıya.",
                        adverts.get(2),
                        users.get(0),
                        new Price(1000000, Currency.TL),
                        true
                )
        );
        estates.add(
                new Estate(
                        "Barbarosta satılık dükkan",
                        "İşlek caddede, yüksek kazanç sağlayan merkezi bir dükkan.",
                        adverts.get(3),
                        users.get(0),
                        new Price(2000000, Currency.TL),
                        true
                )
        );
    }

    public static void generateMessages(){
        messages.add(
                new Message(
                        estates.get(0),
                        users.get(0),
                        users.get(1),
                        "İndirim olur mu?"
                )
        );
        messages.add(
                new Message(
                        estates.get(0),
                        users.get(1),
                        users.get(0),
                        "Son fiyat"
                )
        );
    }

    public static void generateFavoriteEstates(){
        users.get(0).getFavoriteEstates().add(estates.get(0));
        estates.get(0).getFavoriteBy().add(users.get(0));
        users.get(1).getFavoriteEstates().add(estates.get(1));
        estates.get(1).getFavoriteBy().add(users.get(1));
    }
}
