package emlakOOP;

import emlakOOP.enums.AdvertType;
import emlakOOP.model.Estate;
import emlakOOP.model.Message;
import emlakOOP.model.User;
import emlakOOP.model.advert.House;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        MockService.generateMockData();

        List<Estate> filteredEstates = get3plus1and3000TLandIstanbulHouses();
        List<Message> messages = MockService.messages;
        List<Estate> favorite = getAyseSariFavoriteEstates();

        filteredEstates.forEach(k-> System.out.println(k.toString()));

        messages.forEach(k-> System.out.println(k.toString()));

        favorite.forEach(k-> System.out.println(k.toString()));
    }

    public static List<Estate> get3plus1and3000TLandIstanbulHouses(){
        return MockService.estates
                .stream()
                .filter(k -> k.getAdvert().getAdvertType() == AdvertType.HOUSE)
                .filter(k-> k.getAdvert().getAddress().getProvince().equals("İstanbul") &&
                                ((House)k.getAdvert()).getNumberOfRooms() == 3 &&
                                ((House)k.getAdvert()).getNumberOfBathrooms() == 1)
                .collect(Collectors.toList());
    }

    public static List<Estate> getAyseSariFavoriteEstates(){
        User user = MockService.users.stream().filter(k->k.getEmail().equals("ayse.sari@gmail.com")).findFirst().orElse(null);
        assert user != null;
        return user.getFavoriteEstates();
    }
}
