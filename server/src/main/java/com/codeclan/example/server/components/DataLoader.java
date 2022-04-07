package com.codeclan.example.server.components;

import com.codeclan.example.server.enums.PropertyType;
import com.codeclan.example.server.models.*;
import com.codeclan.example.server.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    GuestRepository guestRepository;

    @Autowired
    HostRepository hostRepository;

    @Autowired
    PropertyRepository propertyRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Guest guest1 = new Guest("Steve", "Mieklejohn", "steve@codeclan.com", "(519)-490-1416", 4);
        guestRepository.save(guest1);
        Guest guest2 = new Guest("Craig", "Gough", "craig@codeclan.com", "(673)-179-1238", 3);
        guestRepository.save(guest2);
        Guest guest3 = new Guest("Stan", "Tarnev", "stan@codeclan.com", "(987)-639-2345", 1);
        guestRepository.save(guest3);
        Guest guest4 = new Guest("Jennifer", "Ramsay", "jen@codeclan.com", "(369)-143-0987", 3);
        guestRepository.save(guest4);
        Guest guest5 = new Guest("Ash", "Healy", "ash@codeclan.com", "(876)-333-0912", 5);
        guestRepository.save(guest5);

        Host host1 = new Host("David", "Bell", "davebgla@gmail.com", "(666)-891-0376", 2);
        hostRepository.save(host1);
        Host host2 = new Host("Rory", "Smith", "rory-smith14@hotmail.co.uk", "(901)-322-0910", 4);
        hostRepository.save(host2);
        Host host3 = new Host("Taylor", "Paterson", "taylorpaterson7@hotmail.com", "(111)-671-7543", 5);
        hostRepository.save(host3);
        Host host4 = new Host("David", "Abercrombie", "abercrombiedj2@gmail.com", "(608)-555-4321", 1);
        hostRepository.save(host4);

        Property property1 = new Property(host4, "Inverness", 158, "Cosy cottage in the country with beautiful views set on a farm.", PropertyType.COTTAGE);
        propertyRepository.save(property1);
        Property property2 = new Property(host4, "Glasgow", 60, "You won't forget your time in this memorable place. Self catering caravan a short walk to the shore.", PropertyType.ONE_BED);
        propertyRepository.save(property2);
        Property property3 = new Property(host4, "Aberdeen", 40, "Off-grid Bothy in a remote location.", PropertyType.LODGE);
        propertyRepository.save(property3);
        Property property4 = new Property(host4, "Edinburgh", 399, "A luxury, spacious holiday home with hot tub and sauna.", PropertyType.MANSION);
        propertyRepository.save(property4);
        Property property5 = new Property(host4, "Stirling", 106, "Stunning Georgian townhouse located right in the city centre.", PropertyType.TWO_BED);
        propertyRepository.save(property5);

        Image image1_1 = new Image("https://a0.muscache.com/im/pictures/1b6bb080-45a3-4746-9493-92e7208b2037.jpg?im_w=720", property1);
        imageRepository.save(image1_1);
        Image image1_2 = new Image("https://a0.muscache.com/im/pictures/359a08ad-7455-4f4e-8b53-56c90d63caed.jpg?im_w=720", property1);
        imageRepository.save(image1_2);
        Image image1_3 = new Image("https://a0.muscache.com/im/pictures/c39768df-1a80-4560-854f-91d9893048c2.jpg?im_w=720", property1);
        imageRepository.save(image1_3);
        Image image2_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52019199/original/10ebd15b-8320-4acc-a752-bf994cdf15c8.jpeg?im_w=1200", property2);
        imageRepository.save(image2_1);
        Image image2_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52019199/original/5044bd17-1cff-4436-b1b7-d07d3b88874c.jpeg?im_w=720", property2);
        imageRepository.save(image2_2);
        Image image2_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52019199/original/8d2bf016-9416-4177-8bdb-b9336375edf8.jpeg?im_w=720", property2);
        imageRepository.save(image2_3);
        Image image3_1 = new Image("https://a0.muscache.com/im/pictures/43051403-8399-4f55-8f08-2ffc76a17fb7.jpg?im_w=1200", property3);
        imageRepository.save(image3_1);
        Image image3_2 = new Image("https://a0.muscache.com/im/pictures/99969178-d4c9-45db-94f4-a7b42c8849a5.jpg?im_w=1200", property3);
        imageRepository.save(image3_2);
        Image image3_3 = new Image("https://a0.muscache.com/im/pictures/ef7e80c7-3aee-49c7-a79f-1eab938158fb.jpg?im_w=1200", property3);
        imageRepository.save(image3_3);
        Image image4_1 = new Image("https://a0.muscache.com/im/pictures/cb2a46ec-b498-4e32-beab-aa42685471ae.jpg?im_w=720", property4);
        imageRepository.save(image4_1);
        Image image4_2 = new Image("https://a0.muscache.com/im/pictures/954468ac-ed8d-4a84-becf-8a8af42427bc.jpg?im_w=1200", property4);
        imageRepository.save(image4_2);
        Image image4_3 = new Image("https://a0.muscache.com/im/pictures/be12e574-734d-49e8-b694-2cb952f65410.jpg?im_w=720", property4);
        imageRepository.save(image4_3);
        Image image5_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-11320454/original/82f96463-c859-4042-8e0d-4fb64e6b3cf2.jpeg?im_w=1200", property5);
        imageRepository.save(image5_1);
        Image image5_2 = new Image("https://a0.muscache.com/im/pictures/c7159a63-0c21-443d-b702-aa5b8b50ef7e.jpg?im_w=720", property5);
        imageRepository.save(image5_2);
        Image image5_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-11320454/original/133ccb72-e6c7-4b03-b39e-8c62618f5a6f.jpeg?im_w=720", property5);
        imageRepository.save(image5_3);

        Property property21 = new Property(host3, "Inverness", 450, "The experience we offer is unique. The bedroom is entirely made of glass, you can sleep under the stars in comfort and warmth.", PropertyType.LODGE);
        propertyRepository.save(property21);

        Image image21_1 = new Image("https://a0.muscache.com/im/pictures/80385d19-c9dc-4dda-9d80-e16e55a8a6fd.jpg?im_w=1200", property21);
        imageRepository.save(image21_1);

        Image image21_2 = new Image("https://a0.muscache.com/im/pictures/1294e10c-520d-47ac-a039-980d8e981364.jpg?im_w=1200", property21);
        imageRepository.save(image21_2);

        Image image21_3 = new Image("https://a0.muscache.com/im/pictures/f0847911-6f30-4ddd-bcfd-0f256d4eb45a.jpg?im_w=720", property21);
        imageRepository.save(image21_3);

        Property property22 = new Property(host3, "Stirling", 450, "This six bedroomed, apartment evokes all the romance and adventure of The Outlander series which, along with the history of this area, was the inspiration for the captivating interior", PropertyType.MANSION);
        propertyRepository.save(property22);

        Image image22_1 = new Image("https://a0.muscache.com/im/pictures/d33f28d5-2ae3-4487-a79f-b00a3c6216cc.jpg?im_w=1440", property22);
        imageRepository.save(image22_1);

        Image image22_2 = new Image("https://a0.muscache.com/im/pictures/3adf4413-59df-4c79-9673-0a6f2f4eef5e.jpg?im_w=1200", property22);
        imageRepository.save(image22_2);

        Image image22_3 = new Image("https://a0.muscache.com/im/pictures/c0001dd6-73f0-4888-a108-a3f8b454fb6a.jpg?im_w=1440", property22);
        imageRepository.save(image22_3);

        Property property23 = new Property(host3, "Perth", 200, "A unique luxury log cabin tucked away in the peaceful Scottish Highland countryside just outside Inverness. If you're looking for a romantic getaway for two, this lodge will provide you with comfort, peace and an unforgettable stay.", PropertyType.LODGE);
        propertyRepository.save(property23);

        Image image23_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51699677/original/b3424461-5c8e-40ff-915f-cc7a6db5fd5f.jpeg?im_w=1200", property23);
        imageRepository.save(image23_1);

        Image image23_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51699677/original/b0ece04c-2cd4-4cef-865a-77209b82bb8c.jpeg?im_w=720", property23);
        imageRepository.save(image23_2);

        Image image23_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51699677/original/2092bf39-d0c1-4357-81cc-19738b9e2039.jpeg?im_w=720", property23);
        imageRepository.save(image23_3);

        Property property24 = new Property(host3, "Dundee", 167, "This renovated traditional cottage located in a small hamlet close to St Andrews with easy access to the beautiful beaches and quaint towns.", PropertyType.TWO_BED);
        propertyRepository.save(property24);

        Image image24_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-594003488020012419/original/01b4e43b-3e16-46c5-ba1b-fb19eee920d9.png?im_w=1200", property24);
        imageRepository.save(image24_1);

        Image image24_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-594003488020012419/original/4a29ca2e-3b51-4d67-a6b9-4ffb32344b83.png?im_w=720", property24);
        imageRepository.save(image24_2);

        Image image24_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-594003488020012419/original/da0ee7ce-6198-4ca2-a7aa-061a5bdd0744.png?im_w=1200", property24);
        imageRepository.save(image24_3);

        Property property25 = new Property(host3, "Glasgow", 100, "Stylish one bedroom flat located offering private off street parking on a quiet residential street in the heart of the city. Perfect for single travelers or couples. Recently renovated to a high spec.", PropertyType.ONE_BED);
        propertyRepository.save(property25);

        Image image25_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52465435/original/7a491227-e0f4-4d73-9452-ff166b13500d.jpeg?im_w=1440", property25);
        imageRepository.save(image25_1);

        Image image25_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52465435/original/565e4d7c-9887-42a7-a5f8-4c372c67c140.jpeg?im_w=1440", property25);
        imageRepository.save(image25_2);

        Image image25_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52465435/original/2629808d-3691-422a-aeb6-ac2a60b8c536.jpeg?im_w=1440", property25);
        imageRepository.save(image25_3);

        Property property11 = new Property(host1, "Inverness", 45, "Lovely wooden bothy on a working croft, with views looking along the firth to Cromarty. Comfortable, well equipped, with cosy log burner.", PropertyType.LODGE);
        propertyRepository.save(property11);
        Property property12 = new Property(host1, "Glasgow", 900, "A turreted castle in Glasgow city centre!! Six beautiful and luxurious bedroom suites, 5 roaring fireplaces and Rugby pitch in back garden.", PropertyType.MANSION);
        propertyRepository.save(property12);
        Property property13 = new Property(host1, "Perth", 450, "Number One Rosemount is an extremely unique detached house built in 2011 set within glorious mature gardens. This house is great for families looking for a holiday to remember.", PropertyType.MANSION);
        propertyRepository.save(property13);
        Property property14 = new Property(host1, "Perth", 70, "Stunning rural 2 bedroom cottage in the Perthshire Countryside. Perfect to get away from your busy life.", PropertyType.TWO_BED);
        propertyRepository.save(property14);
        Property property15 = new Property(host1, "Dundee", 100, "Take it easy at this unique and tranquil getaway. Stunning mountain views from a Juliette balcony.", PropertyType.THREE_BED);
        propertyRepository.save(property15);

        Image image11_1 = new Image("https://a0.muscache.com/im/pictures/16fd05e4-1b74-44ab-8fb4-793f378bcd59.jpg?im_w=960", property11);
        imageRepository.save(image11_1);
        Image image11_2 = new Image("https://a0.muscache.com/im/pictures/f2106a3a-6e90-4660-9e4f-dfc2b3035865.jpg?im_w=720", property11);
        imageRepository.save(image11_2);
        Image image11_3 = new Image("https://a0.muscache.com/im/pictures/8b116b5d-ba7a-41c2-bcf7-e5349002cff7.jpg?im_w=1200", property11);
        imageRepository.save(image11_3);
        Image image12_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52841116/original/407b37cb-1f5d-4566-9982-f7535c22ee20.jpeg?im_w=960", property12);
        imageRepository.save(image12_1);
        Image image12_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52841116/original/0b9dc45f-6a66-4606-a10a-c4752332998c.png?im_w=720", property12);
        imageRepository.save(image12_2);
        Image image12_3 = new Image("https://a0.muscache.com/im/pictures/3abc29b2-895e-471e-b7d2-ed97bdd76b58.jpg?im_w=1200", property12);
        imageRepository.save(image12_3);
        Image image13_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51907131/original/7a486bca-f1b2-498e-a2e0-b1ddabc6ed0f.jpeg?im_w=1200", property13);
        imageRepository.save(image13_1);
        Image image13_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51907131/original/ca7d2f91-a802-4cbc-8812-17ed5d423703.jpeg?im_w=1200", property13);
        imageRepository.save(image13_2);
        Image image13_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51907131/original/e8342ee2-cb35-496e-966d-a734cc98b324.jpeg?im_w=1200", property13);
        imageRepository.save(image13_3);
        Image image14_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-50603897/original/d1b5ba09-72aa-49d2-9cd7-8a8d4ef391ca.jpeg?im_w=960", property14);
        imageRepository.save(image14_1);
        Image image14_2 = new Image("https://a0.muscache.com/im/pictures/f6d0f7ce-464d-4931-b0c8-669b5b6d1cd4.jpg?im_w=720", property14);
        imageRepository.save(image14_2);
        Image image14_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-50603897/original/f129f06f-67be-484e-abc1-747d915e3d2f.jpeg?im_w=720", property14);
        imageRepository.save(image14_3);
        Image image15_1 = new Image("https://a0.muscache.com/im/pictures/9a70f62b-decf-4b50-9a18-1dd7e4d672e2.jpg?im_w=960", property15);
        imageRepository.save(image15_1);
        Image image15_2 = new Image("https://a0.muscache.com/im/pictures/b5da27eb-c528-43e1-a5ed-bba96ff1939a.jpg?im_w=1200", property15);
        imageRepository.save(image15_2);
        Image image15_3 = new Image("https://a0.muscache.com/im/pictures/5cb31202-8640-48f5-be56-9f9b07d51de2.jpg?im_w=720", property15);
        imageRepository.save(image15_3);

        Property property31 = new Property(host2, "Glasgow", 145, "The perfect place for those seeking peace and quiet and lovers of nature and beautiful spaces.", PropertyType.ONE_BED);
        propertyRepository.save(property31);

        Property property32 = new Property(host2, "Edinburgh", 148, "Unique designer house with panoramic views of the nature.", PropertyType.TWO_BED);
        propertyRepository.save(property32);

        Property property33 = new Property(host2, "Inverness", 256, "Beautiful, cosy, comfortable chalet on the outskirts, 1 km from the centre.", PropertyType.LODGE);
        propertyRepository.save(property33);

        Property property34 = new Property(host2, "Perth", 303, "Luxury apartment for up to 7 people with large terrace and breathtaking view between lake and mountains in the heart of Scotland!", PropertyType.MANSION);
        propertyRepository.save(property34);

        Property property35 = new Property(host2, "Aberdeen", 204, "Panoramic views without the noise. Perfectly located for ski or hiking holiday.", PropertyType.LODGE);
        propertyRepository.save(property35);

        Image image31_1 = new Image("https://a0.muscache.com/im/pictures/40449378-5ddf-4d9d-9e87-b3025f922e23.jpg?im_w=1200", property31);
        imageRepository.save(image31_1);

        Image image31_2 = new Image("https://a0.muscache.com/im/pictures/f29630f6-6274-4703-97b2-aef2526846cb.jpg?im_w=1200", property31);
        imageRepository.save(image31_2);

        Image image31_3 = new Image("https://a0.muscache.com/im/pictures/cb86f7be-c974-4cf8-9af4-e168438dd0b3.jpg?im_w=1200", property31);
        imageRepository.save(image31_3);

        Image image32_1 = new Image("https://a0.muscache.com/im/pictures/41a79324-4168-4f09-b197-eb84b25c76ba.jpg?im_w=1200", property32);
        imageRepository.save(image32_1);

        Image image32_2 = new Image("https://a0.muscache.com/im/pictures/ed8f0ada-4562-49d4-83e4-dcad2449c923.jpg?im_w=1200", property32);
        imageRepository.save(image32_2);

        Image image32_3 = new Image("https://a0.muscache.com/im/pictures/16fda0b0-e889-441b-864a-4c21aab456ea.jpg?im_w=1200", property32);
        imageRepository.save(image32_3);

        Image image33_1 = new Image("https://a0.muscache.com/im/pictures/prohost-api/Hosting-49304354/original/10ecbfab-a1c3-4ac7-9a85-6ec71d3b01cf.jpeg?im_w=960", property33);
        imageRepository.save(image33_1);

        Image image33_2 = new Image("https://a0.muscache.com/im/pictures/prohost-api/Hosting-49304354/original/645090e8-0719-4718-8d5c-f78fcb10f3ad.jpeg?im_w=1200", property33);
        imageRepository.save(image33_2);

        Image image33_3 = new Image("https://a0.muscache.com/im/pictures/prohost-api/Hosting-49304354/original/fdcbb229-3701-4391-9029-a3b40b5642cf.jpeg?im_w=1200", property33);
        imageRepository.save(image33_3);

        Image image34_1 = new Image("https://a0.muscache.com/im/pictures/9593c04b-65f7-4a12-9bba-237b52133e70.jpg?im_w=960", property34);
        imageRepository.save(image34_1);

        Image image34_2 = new Image("https://a0.muscache.com/im/pictures/4cb5fbc7-37ab-49f1-87e1-69b903e56d0b.jpg?im_w=1200", property34);
        imageRepository.save(image34_2);

        Image image34_3 = new Image("https://a0.muscache.com/im/pictures/cc4ffe9e-6cc4-4778-a3e3-270429130726.jpg?im_w=1200", property34);
        imageRepository.save(image34_3);

        Image image35_1 =new Image("https://a0.muscache.com/im/pictures/bed4618d-22bb-48b4-9e1c-7f6a06345d24.jpg?im_w=1200", property35);
        imageRepository.save(image35_1);

        Image image35_2 = new Image("https://a0.muscache.com/im/pictures/f60fdcdb-2ac7-447e-9d53-a2e35b556a9b.jpg?im_w=1200", property35);
        imageRepository.save(image35_2);

        Image image35_3 = new Image("https://a0.muscache.com/im/pictures/44a520de-32f0-4d42-85c9-2836f83ab523.jpg?im_w=1200", property35);
        imageRepository.save(image35_3);

        Booking booking1 = new Booking(guest1, host1, property1, 2, 1);
        bookingRepository.save(booking1);


    }

}


