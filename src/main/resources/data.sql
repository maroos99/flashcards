insert into USER (id, login, password, name , email, age, user_type) VALUES (1,'user1', 'haslo1', 'imie_user1','jakismail1@o.pl', 30, 'REGULAR_USER');
insert into USER (id, login, password, name , email, age, user_type) VALUES (2,'user2', 'haslo2', 'imie_user2','jakismail2@o.pl', 20, 'REGULAR_USER');
insert into USER (id, login, password, name , email, age, user_type) VALUES (3,'Admin', 'admin1', 'imie_admin','jakismail3@o.pl', 25, 'ADMIN');


insert into FLASHCARD (id, word, word_translation, user_id) VALUES (1, 'be', 'być', 1);
insert into FLASHCARD (id, word, word_translation, user_id) VALUES (2, 'mother', 'matka', 1);
insert into FLASHCARD (id, word, word_translation, user_id) VALUES (3, 'father', 'ojciec', 1);
insert into FLASHCARD (id, word, word_translation, user_id) VALUES (4, 'one', 'jeden', 1);

insert into FLASHCARD (id, word, word_translation, user_id) VALUES (5, 'ship', 'statek', 2);
insert into FLASHCARD (id, word, word_translation, user_id) VALUES (6, 'sky', 'niebo', 2);
insert into FLASHCARD (id, word, word_translation, user_id) VALUES (7, 'twenty-two', 'dwadzieścia dwa', 2);
insert into FLASHCARD (id, word, word_translation, user_id) VALUES (8, 'engineer', 'inżynier', 2);
