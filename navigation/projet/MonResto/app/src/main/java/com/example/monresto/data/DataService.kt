package com.example.monresto.data

import com.example.monresto.R
import com.example.monresto.model.Article
import com.example.monresto.model.Menu

class DataService {


    val nem = Article(name = "Nem", image = R.drawable.nem)
    val fondue = Article(name = "Fondue", image = R.drawable.fondue)
    val nachos = Article(name = "Nachos", image = R.drawable.nachos)
    val cheesecake = Article(name = "Cheesecake", image = R.drawable.cheesecake_citon_litchi)
    val crevette = Article(name = "Crevette", image = R.drawable.crevette_aigre_doux)
    val fajitas = Article(name = "Fajitas", image = R.drawable.fajitas)
    val gazpacho = Article(name = "Gazpacho", image = R.drawable.gazpacho)
    val geateau = Article(name = "Geateau", image = R.drawable.geateau_au_chocolat_suisse)
    val glace = Article(name = "Glace", image = R.drawable.glace_the__vert)
    val mozza = Article(name = "Mozza", image = R.drawable.mozza)
    val nuggets = Article(name = "Nuggets", image = R.drawable.nuggets)
    val pizza = Article(name = "Pizza", image = R.drawable.pizza)
    val paella = Article(name = "Paella", image = R.drawable.paella)
    val sopapilla = Article(name = "Sopapilla", image = R.drawable.sopapilla)
    val churros = Article(name = "Churros", image = R.drawable.churros_et_creme_de_framboise)
    val sundae = Article(name = "Sundae", image = R.drawable.sundae)
    val sushis = Article(name = "Sushis", image = R.drawable.sushis)
    val tiramisu = Article(name = "Tiramisu", image = R.drawable.tiramisu)
    val teriyaki = Article(name = "Teriyaki", image = R.drawable.teriyaki)

    val americain = Menu(name = "Americain", entree = pizza, plat = sushis, dessert = sundae)
    val chinois = Menu(name = "Chinois", entree = nem, plat = crevette, dessert = cheesecake)
    val espagnol = Menu(name = "Espagnol", entree = gazpacho, plat = paella, dessert = churros)
    val italien = Menu(name = "Italien", entree = mozza, plat = pizza, dessert = tiramisu)
    val japonais = Menu(name = "Japonais", entree = sushis, plat = teriyaki, dessert = glace)
    val mexicain = Menu(name = "Mexicain", entree = nachos, plat = fajitas, dessert = sopapilla)
    val suisse = Menu(name = "Suisse", entree = sushis, plat = fondue, dessert = geateau)

    val allMenu = listOf<Menu>(americain, chinois, espagnol, italien, japonais, mexicain, suisse)
}