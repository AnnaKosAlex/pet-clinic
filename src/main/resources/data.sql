INSERT INTO pet.client_card (client_name,phone,email) VALUES
('Валяев Александр','89165423647','valalex@mail.ru')
,('Ковалева Людмила','89106543217','kovallyudmila@mail.ru')
,('Изева Анастасия','89168467364','izevaana@mail.ru')
,('Горбачев Юрий','89169836471','gorbachev@mail.ru')
,('Любкина Анна','89169035674','lyubkina@mail.ru')
,('Лосева Инна','89156894321','losevainna@mail.ru')
,('Давыдов Юрий','89099876354','davura@mail.ru')
,('Зевкин Алексей','89160125873','zevkin@mail.ru')
,('Кулев Александр','89109876543','kulal@mail.ru')
,('Белая Александра','89165439456','belal@mail.ru')
,('Норкиина Юлия','89059835764','norulx@mail.ru')
;


INSERT INTO pet.clinic (address,openning_hours,closing_hours,phone) VALUES
('г. Москва, ул. Генерала белова, 36','00:00:00','00:00:00','84953647568')
,('г. Москва, ул. Академика Скрябина, 5','00:00:00','00:00:00','8495309874')
,('г. Москва, Зеленый проспект, 14','00:00:00','00:00:00','84953647381')
,('г. Москва, Урюкская улица, 23','00:00:00','00:00:00','84953463790')
,('г. Москва, Ул. Строговая, 67','00:00:00','00:00:00','84953675894')
,('г. Москва, Приморский проспект, 14','00:00:00','00:00:00','84953047586')
,('г. Москва, ул. Роговая, 13','00:00:00','00:00:00','84953497218')
,('г. Москва, Ул. Волевая, 74','00:00:00','00:00:00','84953736489')
,('г. Москва, Зеленый проспект, 98','00:00:00','00:00:00','84953123407')
,('г. Москва, ул. Ячменная, 2','00:00:00','00:00:00','84953839393')
,('г. Москва, Ул. Головина, 7','00:00:00','00:00:00','84953846362')
;


INSERT INTO pet.doctor (doctor_name,qualification,age,phone) VALUES
('Редькин Юрий','онколог',45,'89665477223')
,('Ольхова Ольга','офтальмолог',41,'89168738934')
,('Верховая Анастасия','врач общей практики',38,'89109836452')
,('Головнев Игорь','орнитолог',36,'89167839402')
,('Ван-ю-Цай Алина','герпетолог',37,'89657865142')
,('Заболотная Евгения','ратолог',45,'89159763435')
,('Ершор Антон','невролог',55,'8916983746')
,('Долгих Евгений','дерматолог',50,'8169087612')
,('Тихонов Роман','хирург',40,'89098763892')
,('Операвин Никита','хирург',35,'89097354782')
,('Лохнин Иван','кардиолог',32,'89903747373')
,('Ляшева Алина','узист',32,'89903747373')
;


INSERT INTO pet.doctor_account (login,"password",doctor_id) VALUES
('redkin','121',1)
,('olhova','122',2)
,('verhovaya','123',3)
,('golovnev','124',4)
,('vaucay','125',5)
,('zabolotnaya','126',6)
,('ershor','127',7)
,('dolgih','128',8)
,('tihonov','129',9)
,('operavin','1210',10)
,('lohnin','1211',11)
,('lyasheva','1212',12)
;



INSERT INTO pet.pet_medical_card (pet_name, pet_type, age ,owner_id, doctor_id, diagnosis , appointment) VALUES
('Кеша','попугай','2 года', 3, 4,'микоплазмоз','эвтаназия')
,('Луиза','кошка','5 месяцев', 2, 3,'перелом хвоста','консультация хирурга')
,('Барсик','кот','1 год', 1, 3,'кастрация','консультация хирурга')
,('Тузик','собака','2 года', 6, 3,'ушная инфекция','отипакс 2 раза в утки, промыв ушец 2 раза в сутки')
,('Буся','морская свинка','1 год', 5,6,'здоров','назначений нет')
,('Кнопа','кролик','2 года', 4,6,'вакицнация','ВГБК')
,('Тайсон','кот','5 лет', 7, 8,'аллергия','апоквел')
,('Рудольф','собака','7 лет', 8, 3,'онкология','эвтаназия')
,('Меланхолия','кошка','6 месяцев', 9, 3,'здорова','назначений нет')
,('Хьюго','кот','16 лет', 10, 3,'подозрение на полиорганную недостаточность','сдача ОКА и БХ развернутой')
,('Говард','собака','4 месяца', 11, 3,'здоров','назначений нет')
;

INSERT INTO pet.price_list (service,priсe) VALUES
('санация ушных раковин',300)
,('стрижка когтей',400)
,('кастрация кота',2500)
,('кастрация кошки',5000)
,('кастрация кобеля',10000)
,('кастрация суки',25000)
,('прием врача общей практики',500)
,('прием герпетолога',1000)
,('прием онколога',1000)
,('прием ратолога',1000)
,('прием дерматолога',1000)
,('прием кардиолога',1000)
,('прием орнитолога',1000)
,('прием хирурга',1000)
,('эвтаназия попугая',2000)
,('эвтаназия кошки',5000)
,('эвтаназия собаки',10000)
,('эвтаназия грызунов',3000)
,('эвтаназия рептилий',3000)
;


INSERT INTO pet."session" (date_time,client_id,doctor_id,service_id,clinic_id) VALUES
('2020-05-23',1,1,1,1)
,('2020-05-24',2,2,2,2)
,('2020-05-25',3,3,3,3)
,('2020-05-26',4,4,4,4)
,('2020-05-27',5,5,5,5)
,('2020-05-28',6,6,6,6)
,('2020-05-29',7,7,7,7)
,('2020-05-28',8,8,8,8)
,('2020-05-27',9,9,9,9)
,('2020-05-26',10,10,10,10)
,('2020-05-25',11,11,11,11)
;


INSERT INTO pet.timetable (clinic_id,doctor_id,"date",cabinet) VALUES
(1,3,'2020-05-23',1)
,(2,4,'2020-05-24',1)
,(3,1,'2020-05-25',1)
,(4,5,'2020-05-25',1)
,(5,2,'2020-05-26',1)
,(6,3,'2020-05-26',1)
,(6,6,'2020-05-26',2)
,(7,11,'2020-05-27',1)
,(8,7,'2020-05-28',1)
,(9,8,'2020-05-29',1)
,(10,9,'2020-05-28',1)
,(11,10,'2020-05-29',1)
;

insert into session_service (session_id , service_id ) values
(1, 1),
(1, 3),
(1, 5),
(2, 1),
(1, 3),
(3, 1),
(3, 5),
(4, 6),
(5, 7),
(6, 8),
(7, 9),
(8, 10),
(9, 11),
(10, 12)