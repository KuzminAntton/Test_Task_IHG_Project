# Test_Task_IHG_Project
Тестовый проект для проекта Travel Solutions (в рамках компании EPAM systems)
задание было следующие :
Необходимо вывести в консоль:
1.	Первых 5 отелей с высокими рейтингами, начиная с наибольшего рейтинга,  с включенными завтраками.
2.	Весь список отелей сгруппированный по типам и при этом отели в каждой группе должны быть отсортированы по увеличению цены в каждой группе.
Пример:

Hotel:
          “Hilton”,       Hotel,   75.99 $,  9.3,  breakfast_included
          “Hotel Jonico”,     Hotel,   85.07 $,  8.4,  breakfast_not_included
          “Sofitel Rome Villa Borghese”,  Hotel,   85.34 $,  5.9,  breakfast_included
          “Hotel Cosmopolita”,    Hotel,   90.00 $,  8.0,  breakfast_not_included
          “Crowne Plaza Rome”,    Hotel,   118.30 $,  7.9,  breakfast_not_included
          Hostel:
          “Ostello Bello”,     Hostel,  25.99 $,  8.3,  breakfast_not_included
          “Hostel Urban Navigli”,   Hostel,  27.00 $,  7.2,  breakfast_not_included
          “Un posto a Milano”,    Hostel,  35.65 $,  7.6,  breakfast_not_included
          “Hostel Colours”,     Hostel,  45.00 $,  6.9,  breakfast_included
          Apartment: 
           “Venezia Apartment”,    Apartment,  45.00 $,  9.5,  breakfast_not_included
          “Apartment Amelie”,    Apartment,  47.00 $,  6.3,  breakfast_not_included
          “Brera Apartments”,    Apartment,  47.35 $,  6.4,  breakfast_not_included
          “Aparthotel Duomo”,    Apartment,  50.50 $,  9.7,  breakfast_not_included
          “The Loft Apartment - Milan”,  Apartment,  55.60 $,  6.3,  breakfast_not_included
          “Monte Napoleone Apartment”,  Apartment,  57.99 $,  8.5,  breakfast_not_included
          “Apartament San Siro”,    Apartment,  95.00 $,  8.1,  breakfast_not_included

3.	Весь список отелей сгуппированный по ценовому диапазону (0-39.99 $, 40-79,99 $, 80 $+) и при этом отели в каждой группе должны быть отсортированы по алфавиту.
Пример:

0-39.99 $
          “Hostel Urban Navigli”,   Hostel,  27.00 $,  7.2,  breakfast_not_included
          “Ostello Bello”,     Hostel,  25.99 $,  8.3,  breakfast_not_included
          “Un posto a Milano”,    Hostel,  35.65 $,  7.6,  breakfast_not_included
40-79.99 $
          “Apartment Amelie”,    Apartment,  47.00 $,  6.3,  breakfast_not_included
          “Aparthotel Duomo”,    Apartment,  50.50 $,  9.7,  breakfast_not_included
          “Brera Apartments”,    Apartment,  47.35 $,  6.4,  breakfast_not_included
          “Hilton”,       Hotel,   75.99 $,  9.3,  breakfast_included
          “Hostel Colours”,     Hostel,  45.00 $,  6.9,  breakfast_included
          “Monte Napoleone Apartment”,  Apartment,  57.99 $,  8.5,  breakfast_not_included
          “The Loft Apartment - Milan”,  Apartment,  55.60 $,  6.3,  breakfast_not_included
          “Venezia Apartment”,    Apartment,  45.00 $,  9.5,  breakfast_not_included
80+ $
          “Apartament San Siro”,    Apartment,  95.00 $,  8.1,  breakfast_not_included
          “Crowne Plaza Rome”,    Hotel,   118.30 $,  7.9,  breakfast_not_included
          “Hotel Cosmopolita”,    Hotel,   90.00 $,  8.0,  breakfast_not_included
          “Hotel Jonico”,     Hotel,   85.07 $,  8.4,  breakfast_not_included
          “Sofitel Rome Villa Borghese”,  Hotel,   85.34 $,  5.9,  breakfast_included

реализован на Java и на Groovy
при выполнении прграммы если что то будет непонятно вызовится комманда help и поможет вам разобраться =)
