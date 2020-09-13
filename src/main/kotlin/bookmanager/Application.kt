package bookmanager

import org.h2.tools.Server;
import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	Server.createWebServer().start() //H2コンソール見るために追加
	build()
	    .args(*args)
		.packages("bookmanager")
		.start()
}

