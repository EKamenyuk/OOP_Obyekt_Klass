import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() {

    }

    @Test
    fun add() {
        val service = WallService
        val postNew = service.add(Post(
            111,
            12345,
            12345,
            111111,
            120920221433,
            "Текст поста",
            12345,
            6765,
            true,
            Comments(300, true, false, false,true),
            //Copyright(23452784, "dfdfdsf","Текст","тип"),
            Likes(400, true, true,true),
            Reposts(200, false),
            Views(20000),
            "post", //post, copy, reply, postpone, suggest.
            12345,
            true,
            true,
            false,
            true,
            false,
            false,
            //Donut(true, 223,"placeholder", true, "all"),
            1
        ))

        assertTrue(postNew.id > 0)
    }
    }
