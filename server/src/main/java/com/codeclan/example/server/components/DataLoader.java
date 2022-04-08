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
        Image image1_1 = new Image("https://a0.muscache.com/im/pictures/1b6bb080-45a3-4746-9493-92e7208b2037.jpg?im_w=720", property1);
        imageRepository.save(image1_1);
        Image image1_2 = new Image("https://a0.muscache.com/im/pictures/359a08ad-7455-4f4e-8b53-56c90d63caed.jpg?im_w=720", property1);
        imageRepository.save(image1_2);
        Image image1_3 = new Image("https://a0.muscache.com/im/pictures/c39768df-1a80-4560-854f-91d9893048c2.jpg?im_w=720", property1);
        imageRepository.save(image1_3);

        Property property2 = new Property(host4, "Glasgow", 60, "You won't forget your time in this memorable place. Self catering caravan a short walk to the shore.", PropertyType.ONE_BED);
        propertyRepository.save(property2);
        Image image2_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52019199/original/10ebd15b-8320-4acc-a752-bf994cdf15c8.jpeg?im_w=1200", property2);
        imageRepository.save(image2_1);
        Image image2_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52019199/original/5044bd17-1cff-4436-b1b7-d07d3b88874c.jpeg?im_w=720", property2);
        imageRepository.save(image2_2);
        Image image2_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52019199/original/8d2bf016-9416-4177-8bdb-b9336375edf8.jpeg?im_w=720", property2);
        imageRepository.save(image2_3);

        Property property3 = new Property(host4, "Aberdeen", 40, "Off-grid Bothy in a remote location.", PropertyType.LODGE);
        propertyRepository.save(property3);
        Image image3_1 = new Image("https://a0.muscache.com/im/pictures/43051403-8399-4f55-8f08-2ffc76a17fb7.jpg?im_w=1200", property3);
        imageRepository.save(image3_1);
        Image image3_2 = new Image("https://a0.muscache.com/im/pictures/99969178-d4c9-45db-94f4-a7b42c8849a5.jpg?im_w=1200", property3);
        imageRepository.save(image3_2);
        Image image3_3 = new Image("https://a0.muscache.com/im/pictures/ef7e80c7-3aee-49c7-a79f-1eab938158fb.jpg?im_w=1200", property3);
        imageRepository.save(image3_3);

        Property property4 = new Property(host4, "Edinburgh", 399, "A luxury, spacious holiday home with hot tub and sauna.", PropertyType.MANSION);
        propertyRepository.save(property4);
        Image image4_1 = new Image("https://a0.muscache.com/im/pictures/cb2a46ec-b498-4e32-beab-aa42685471ae.jpg?im_w=720", property4);
        imageRepository.save(image4_1);
        Image image4_2 = new Image("https://a0.muscache.com/im/pictures/954468ac-ed8d-4a84-becf-8a8af42427bc.jpg?im_w=1200", property4);
        imageRepository.save(image4_2);
        Image image4_3 = new Image("https://a0.muscache.com/im/pictures/be12e574-734d-49e8-b694-2cb952f65410.jpg?im_w=720", property4);
        imageRepository.save(image4_3);

        Property property5 = new Property(host4, "Stirling", 106, "Stunning Georgian townhouse located right in the city centre.", PropertyType.TWO_BED);
        propertyRepository.save(property5);
        Image image5_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-11320454/original/82f96463-c859-4042-8e0d-4fb64e6b3cf2.jpeg?im_w=1200", property5);
        imageRepository.save(image5_1);
        Image image5_2 = new Image("https://a0.muscache.com/im/pictures/c7159a63-0c21-443d-b702-aa5b8b50ef7e.jpg?im_w=720", property5);
        imageRepository.save(image5_2);
        Image image5_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-11320454/original/133ccb72-e6c7-4b03-b39e-8c62618f5a6f.jpeg?im_w=720", property5);
        imageRepository.save(image5_3);

        Property property6 = new Property(host1, "Inverness", "IV19FA", 45, "Lovely wooden bothy on a working croft, with views looking along the firth to Cromarty. Comfortable, well equipped, with cosy log burner.", PropertyType.LODGE);
        propertyRepository.save(property6);
        Image image6_1 = new Image("https://a0.muscache.com/im/pictures/16fd05e4-1b74-44ab-8fb4-793f378bcd59.jpg?im_w=960", property6);
        imageRepository.save(image6_1);
        Image image6_2 = new Image("https://a0.muscache.com/im/pictures/f2106a3a-6e90-4660-9e4f-dfc2b3035865.jpg?im_w=720", property6);
        imageRepository.save(image6_2);
        Image image6_3 = new Image("https://a0.muscache.com/im/pictures/8b116b5d-ba7a-41c2-bcf7-e5349002cff7.jpg?im_w=1200", property6);
        imageRepository.save(image6_3);

        Property property7 = new Property(host1, "Glasgow", "G432DS", 900, "A turreted castle in Glasgow city centre!! Six beautiful and luxurious bedroom suites, 5 roaring fireplaces and Rugby pitch in back garden.", PropertyType.MANSION);
        propertyRepository.save(property7);
        Image image7_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52841116/original/407b37cb-1f5d-4566-9982-f7535c22ee20.jpeg?im_w=960", property7);
        imageRepository.save(image7_1);
        Image image7_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-52841116/original/0b9dc45f-6a66-4606-a10a-c4752332998c.png?im_w=720", property7);
        imageRepository.save(image7_2);
        Image image7_3 = new Image("https://a0.muscache.com/im/pictures/3abc29b2-895e-471e-b7d2-ed97bdd76b58.jpg?im_w=1200", property7);
        imageRepository.save(image7_3);

        Property property8 = new Property(host1, "Perth", "PH11DG", 450, "Number One Rosemount is an extremely unique detached house built in 2011 set within glorious mature gardens. This house is great for families looking for a holiday to remember.", PropertyType.MANSION);
        propertyRepository.save(property8);
        Image image8_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51907131/original/7a486bca-f1b2-498e-a2e0-b1ddabc6ed0f.jpeg?im_w=1200", property8);
        imageRepository.save(image8_1);
        Image image8_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51907131/original/ca7d2f91-a802-4cbc-8812-17ed5d423703.jpeg?im_w=1200", property8);
        imageRepository.save(image8_2);
        Image image8_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-51907131/original/e8342ee2-cb35-496e-966d-a734cc98b324.jpeg?im_w=1200", property8);
        imageRepository.save(image8_3);

        Property property9 = new Property(host1, "Perth", "PH11JL", 70, "Stunning rural 2 bedroom cottage in the Perthshire Countryside. Perfect to get away from your busy life.", PropertyType.TWO_BED);
        propertyRepository.save(property9);
        Image image9_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-50603897/original/d1b5ba09-72aa-49d2-9cd7-8a8d4ef391ca.jpeg?im_w=960", property9);
        imageRepository.save(image9_1);
        Image image9_2 = new Image("https://a0.muscache.com/im/pictures/f6d0f7ce-464d-4931-b0c8-669b5b6d1cd4.jpg?im_w=720", property9);
        imageRepository.save(image9_2);
        Image image9_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-50603897/original/f129f06f-67be-484e-abc1-747d915e3d2f.jpeg?im_w=720", property9);
        imageRepository.save(image9_3);

        Property property10 = new Property(host1, "Dundee", "DD11LH", 100, "Take it easy at this unique and tranquil getaway. Stunning mountain views from a Juliette balcony.", PropertyType.THREE_BED);
        propertyRepository.save(property10);
        Image image10_1 = new Image("https://a0.muscache.com/im/pictures/9a70f62b-decf-4b50-9a18-1dd7e4d672e2.jpg?im_w=960", property10);
        imageRepository.save(image10_1);
        Image image10_2 = new Image("https://a0.muscache.com/im/pictures/b5da27eb-c528-43e1-a5ed-bba96ff1939a.jpg?im_w=1200", property10);
        imageRepository.save(image10_2);
        Image image10_3 = new Image("https://a0.muscache.com/im/pictures/5cb31202-8640-48f5-be56-9f9b07d51de2.jpg?im_w=720", property10);
        imageRepository.save(image10_3);

        Property property11 = new Property(host3, "Inverness", "IV11HD", 450, "The experience we offer is unique. The bedroom is entirely made of glass, you can sleep under the stars in comfort and warmth.", PropertyType.LODGE);
        propertyRepository.save(property11);
        Image image11_1 = new Image("https://a0.muscache.com/im/pictures/80385d19-c9dc-4dda-9d80-e16e55a8a6fd.jpg?im_w=1200", property11);
        imageRepository.save(image11_1);
        Image image11_2 = new Image("https://a0.muscache.com/im/pictures/1294e10c-520d-47ac-a039-980d8e981364.jpg?im_w=1200", property11);
        imageRepository.save(image11_2);
        Image image11_3 = new Image("https://a0.muscache.com/im/pictures/f0847911-6f30-4ddd-bcfd-0f256d4eb45a.jpg?im_w=720", property11);
        imageRepository.save(image11_3);

        Property property12 = new Property(host3, "Port Of Menteith", "FK83LE", 288, "The Bothy, a stunning cabin, nestled in the Menteith Hills on an 84 acre farm, offers a magical experience where you can reconnect with nature", PropertyType.LODGE);
        propertyRepository.save(property12);
        Image image12_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-32102823/original/73d32416-c35c-4f1a-b48f-252094c68be8.jpeg?im_w=1200", property12);
        imageRepository.save(image12_1);
        Image image12_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-32102823/original/6823cb35-4f1e-4842-8f9c-fadfb2c12e74.jpeg?im_w=720", property12);
        imageRepository.save(image12_2);
        Image image12_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-32102823/original/e5437580-1fb0-49f5-b0f3-8dc63ab1877f.jpeg?im_w=720", property12);
        imageRepository.save(image12_3);

        Property property13 = new Property(host3, "Perth and Kinross", "DD19UZ", 190, "Waterfall Cottage is a luxury semi detached cottage for two people, nestled into the hills overlooking Loch Tay close to a beautiful bubbling stream and breathtaking views", PropertyType.LODGE);
        propertyRepository.save(property13);
        Image image13_1 = new Image("https://a0.muscache.com/im/pictures/d337e9bd-0e8c-4745-a7e2-cd04be012519.jpg?im_w=960", property13);
        imageRepository.save(image13_1);
        Image image13_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-20855925/original/e16020e6-08e5-431b-89bc-39c8e1f45f39.jpeg?im_w=720", property13);
        imageRepository.save(image13_2);
        Image image13_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-20855925/original/5d04eb85-e59e-4a58-b826-e4c2de78b354.jpeg?im_w=1200", property13);
        imageRepository.save(image13_3);

        Property property14 = new Property(host3, "Morvern", "PA805LQ",  160, "Aandehul is a beautiful architect designed house with spectacular views across the Sound of Mull.", PropertyType.TWO_BED);
        propertyRepository.save(property14);
        Image image14_1 = new Image("https://a0.muscache.com/im/pictures/c7e92b89-4bfe-4ad0-b8fc-e32411351dc8.jpg?im_w=720", property14);
        imageRepository.save(image14_1);
        Image image14_2 = new Image("https://a0.muscache.com/im/pictures/71aa6b27-bb18-4005-89aa-a13f3749a054.jpg?im_w=960", property14);
        imageRepository.save(image14_2);
        Image image14_3 = new Image("https://a0.muscache.com/im/pictures/ec8c7a45-14b0-4cc2-8e13-c705ceceda3c.jpg?im_w=720", property14);
        imageRepository.save(image14_3);

        Property property15 = new Property(host3, "Kilchoan", "PH364LP", 137, "Stunning cottage surrounded by wild open croft land in the village of Kilchoan. Panoramic sea & mountain views.", PropertyType.THREE_BED);
        propertyRepository.save(property15);
        Image image15_1 = new Image("https://a0.muscache.com/im/pictures/ea9c9b37-4ed0-45d4-acca-b624c22a322c.jpg?im_w=720", property15);
        imageRepository.save(image15_1);
        Image image15_2 = new Image("https://a0.muscache.com/im/pictures/35d69e0f-9e49-4662-bbd1-81c3160311c4.jpg?im_w=720", property15);
        imageRepository.save(image15_2);
        Image image15_3 = new Image("https://a0.muscache.com/im/pictures/4c3a63e9-c22f-4f36-949b-ee1dcc0efcbb.jpg?im_w=720", property15);
        imageRepository.save(image15_3);

        Property property16 = new Property(host2, "Strontian", "PH364BB", 139, "Explore the Highlands from this unique, elevated, cruck-frame strawbale house with southerly views over Loch Sunart and a hot tub on the large deck.", PropertyType.ONE_BED);
        propertyRepository.save(property16);
        Image image16_1 = new Image("https://a0.muscache.com/im/pictures/prohost-api/Hosting-30817831/original/36cedf4d-85ea-4708-b970-d3a273bc3794.jpeg?im_w=960", property16);
        imageRepository.save(image16_1);
        Image image16_2 = new Image("https://a0.muscache.com/im/pictures/prohost-api/Hosting-30817831/original/bd8382d9-9f62-4d47-b55b-3147c96dfe2c.jpeg?im_w=1200", property16);
        imageRepository.save(image16_2);
        Image image16_3 = new Image("https://a0.muscache.com/im/pictures/prohost-api/Hosting-30817831/original/6e7d4dfe-1f1e-42f0-8364-c5540d7bf2dc.jpeg?im_w=1200", property16);
        imageRepository.save(image16_3);

        Property property17 = new Property(host2, "Peebles", "EH458AY", 165, "Authentic medieval mini castle with roaring log fires and all modern comforts. In beautiful countryside on the River Tweed. Ideal for exploring the Scottish Borders.", PropertyType.MANSION);
        propertyRepository.save(property17);
        Image image17_1 = new Image("https://a0.muscache.com/im/pictures/a84451a3-721b-4a60-aabc-d3f193aedc11.jpg?im_w=720", property17);
        imageRepository.save(image17_1);
        Image image17_2 = new Image("https://a0.muscache.com/im/pictures/49760720/7c4713ba_original.jpg?im_w=720", property17);
        imageRepository.save(image17_2);
        Image image17_3 = new Image("https://a0.muscache.com/im/pictures/37bfe6bc-ced8-478e-b4b8-abd605e3e826.jpg?im_w=720", property17);
        imageRepository.save(image17_3);

        Property property18 = new Property(host2, "Burntisland", "KY39AE", 149,"Restored attractive 2 storey c1900 cottage in the beautiful grounds of Historic Scotland listed Bendameer House", PropertyType.THREE_BED);
        propertyRepository.save(property18);
        Image image18_1 = new Image("https://a0.muscache.com/im/pictures/67215609/2e7f8529_original.jpg?im_w=960", property18);
        imageRepository.save(image18_1);
        Image image18_2 = new Image("https://a0.muscache.com/im/pictures/57a3b36d-0e45-45b4-90f4-23a72babf907.jpg?im_w=1200", property18);
        imageRepository.save(image18_2);
        Image image18_3 = new Image("https://a0.muscache.com/im/pictures/b3040132-0c8c-48de-afea-69db27713817.jpg?im_w=1200", property18);
        imageRepository.save(image18_3);

        Property property19 = new Property(host2, "Milton of Campsie", "G668HY", 110, "The Pavilion is situated in extensive woodlands overlooking its own courtyard and garden area. The house and garden have beautiful views of the Campsie Hills, and rural farmland.", PropertyType.MANSION);
        propertyRepository.save(property19);
        Image image19_1 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-48780768/original/5a60ff72-88c9-48a9-a26b-7cce0b1eb6aa.jpeg?im_w=960", property19);
        imageRepository.save(image19_1);
        Image image19_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-48780768/original/0ba7865e-3d9a-4506-b3f9-601ea59b8e49.jpeg?im_w=720", property19);
        imageRepository.save(image19_2);
        Image image19_3 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-48780768/original/f9f08b16-eab8-4b22-afab-aeea23889f31.jpeg?im_w=1200", property19);
        imageRepository.save(image19_3);

        Property property20 = new Property(host2, "Dalkeith", "EH221AQ", 160, "The water tower is a bespoke home in an historic building sensitively converted by its architect owner.", PropertyType.THREE_BED);
        propertyRepository.save(property20);
        Image image20_1 =new Image("https://a0.muscache.com/im/pictures/c72d2e77-70f7-4994-88ca-ef1efe36abdb.jpg?im_w=960", property20);
        imageRepository.save(image20_1);
        Image image20_2 = new Image("https://a0.muscache.com/im/pictures/miso/Hosting-17233640/original/a03b0c01-4fb6-4cc7-a1c2-c0cc2de46a8a.jpeg?im_w=1200", property20);
        imageRepository.save(image20_2);
        Image image20_3 = new Image("https://a0.muscache.com/im/pictures/57872b0f-4510-4421-9706-b2b66bd864b8.jpg?im_w=720", property20);
        imageRepository.save(image20_3);

        Booking booking1 = new Booking(guest1, property1, 2, 1);
        bookingRepository.save(booking1);


    }

}


