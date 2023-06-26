package com.example.recipeapp

import com.example.recipeapp.models.Meal

object Data {
    val recipeList = listOf(
        Meal(
            id = 1,
            title = "Best Bobotie",
            prep = "1hr 50mins",
            description = "Serves 6",
            ingredients = " 2 tablespoons vegetable oil\n" +
                    "\n" +
                    "2 medium onions, minced\n" +
                    "\n" +
                    "1 ½ pounds ground beef\n" +
                    "\n" +
                    "1 cup milk\n" +
                    "\n" +
                    "2 slices Texas toast thick-sliced bread\n" +
                    "\n" +
                    "½ cup raisins\n" +
                    "\n" +
                    "1 tablespoon hot chutney\n" +
                    "\n" +
                    "½ tablespoon curry powder\n" +
                    "\n" +
                    "1 teaspoon apricot jam\n" +
                    "\n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon ground black pepper\n" +
                    "\n" +
                    "1 large egg\n" +
                    "\n" +
                    "1 pinch salt\n" +
                    "\n" +
                    "1 bay leaf",
            steps = "Preheat the oven to 350 degrees F (175 degrees C). Lightly grease a 9x13-inch baking dish.\n" +
                    "\n" +
                    "Heat oil in a large skillet over medium-high heat. Cook onions in hot oil until soft, 2 to 3 minutes. Crumble ground beef into the skillet; cook and stir until brown, 8 to 10 minutes.\n" +
                    "\n" +
                    "Pour milk in a shallow dish. Soak bread in milk. Squeeze excess milk from bread and set milk aside.\n" +
                    "\n"+
                    "Add bread to beef mixture. Stir in raisins, chutney, curry powder, apricot jam, salt, and black pepper. Pour mixture into the prepared baking dish.\n"+
                    "\n" +
                    "Bake in the preheated oven for 1 hour.\n" +
                    "\n" +
                    "Whisk together reserved milk, egg, and a pinch of salt. Pour over top of beef mixture. Lay bay leaf on top of milk mixture.\n" +
                    "\n"+
                    "Continue baking until top is golden brown, 25 to 30 minutes. Remove bay leaf before serving.",
            mealImageId = R.drawable.p1
        ),
        Meal(
            id = 2,
            title = "Lamb Tangine",
            prep = "10hrs 45mins",
            description = "Has 4 servings",
            ingredients= "2 pounds lamb meat, cut into 1 1/2 inch cubes\n" +
                    "\n" +
                    "3 tablespoons olive oil, divided\n" +
                    "\n" +
                    "2 teaspoons paprika\n" +
                    "\n" +
                    "1 teaspoon ground cinnamon\n" +
                    "\n" +
                    "1 teaspoon kosher salt\n" +
                    "\n" +
                    "¾ teaspoon garlic powder\n" +
                    "\n" +
                    "¾ teaspoon ground coriander\n" +
                    "\n" +
                    "½ teaspoon ground cumin\n" +
                    "\n" +
                    "½ teaspoon ground cardamom\n" +
                    "\n" +
                    "½ teaspoon ground ginger\n" +
                    "\n" +
                    "¼ teaspoon ground turmeric\n" +
                    "\n" +
                    "¼ teaspoon cayenne pepper\n" +
                    "\n" +
                    "¼ teaspoon ground cloves\n" +
                    "\n" +
                    "1 pinch saffron\n" +
                    "\n" +
                    "2 medium onions, cut into 1-inch cubes\n" +
                    "\n" +
                    "5 carrots, peeled, cut into fourths, then sliced lengthwise into thin strips\n" +
                    "\n" +
                    "3 cloves garlic, minced\n" +
                    "\n" +
                    "1 tablespoon freshly grated ginger\n" +
                    "\n" +
                    "1 lemon, zested\n" +
                    "\n" +
                    "1 (14.5 ounce) can homemade chicken broth or low-sodium canned broth\n" +
                    "\n" +
                    "1 tablespoon sun-dried tomato paste\n" +
                    "\n" +
                    "1 tablespoon honey\n" +
                    "\n" +
                    "1 tablespoon cornstarch (Optional)\n" +
                    "\n" +
                    "1 tablespoon water (Optional)",
            steps = "Place lamb and 2 tablespoons olive oil in a large bowl and toss to coat; set aside.\n" +
                    "Mix together paprika, cinnamon, salt, garlic powder, coriander, cumin, cardamom, ginger, turmeric, cayenne, cloves, and saffron in a large resealable bag. Add lamb to the bag and toss around to coat well. Refrigerate for at least 8 hours, preferably overnight.\n" +
                    "Heat remaining 1 tablespoon olive oil in a large, heavy-bottomed pot over medium-high heat. Add 1/3 of the lamb and brown well, 5 to 7 minutes. Remove to a plate and repeat to cook remaining two batches of lamb.\n" +
                    "Add onions and carrots to the pot and cook for 5 minutes. Stir in garlic and ginger; continue cooking for an additional 5 minutes. Return lamb to the pot and stir in lemon zest, chicken broth, tomato paste, and honey. Bring to a boil, then reduce heat to low. Cover and simmer, stirring occasionally, until meat is tender, 1 1/2 to 2 hours.\n" +
                    "If the consistency of tagine is too thin, you may thicken it with cornstarch and water slurry during the last 5 minutes.\n" +
                    "Serve over couscous.\n",
            mealImageId = R.drawable.p2
        ),
        Meal(
            id = 3,
            title = "Chakchouka (Shakshouka)",
            prep = "40mins",
            description = "4 Servings",
            ingredients= "3 tablespoons olive oil\n" +
                    "\n" +
                    "1 ⅓ cups chopped onion\n" +
                    "\n" +
                    "1 cup thinly sliced bell peppers, any color\n" +
                    "\n" +
                    "2 cloves garlic, minced, or to taste\n" +
                    "\n" +
                    "2 ½ cups chopped tomatoes\n" +
                    "\n" +
                    "1 hot chile pepper, seeded and finely chopped, or to taste\n" +
                    "\n" +
                    "1 teaspoon ground cumin\n" +
                    "\n" +
                    "1 teaspoon paprika\n" +
                    "\n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "4 large eggs",
            steps = "Heat olive oil in a skillet over medium heat. Stir in onion, bell pepper, and garlic; cook and stir until vegetables have softened and onion has turned translucent, about 5 minutes.\n" +
                    "Meanwhile, mix together tomatoes, chile pepper, cumin, paprika, and salt in a bowl.\n" +
                    "Stir tomato mixture into onion mixture. Simmer, uncovered, until tomato juices have cooked off, about 10 minutes.\n" +
                    "Make 4 indentations in tomato mixture; crack eggs into indentations. Cover the skillet and cook until eggs are firm but not dry, about 5 minutes.\n",
            mealImageId = R.drawable.p3
        ),
        Meal(
            id = 4,
            title = "Homemade Periperi Chicken",
            prep = "3hrs 35mins",
            description = "Serves 4",
            ingredients = "1 cup fresh lemon juice\n" +
                    "\n" +
                    "¼ cup paprika\n" +
                    "\n" +
                    "2 tablespoons hot chili powder\n" +
                    "\n" +
                    "3 cloves garlic, minced\n" +
                    "\n" +
                    "1 ½ teaspoons chopped fresh ginger\n" +
                    "\n" +
                    "1 ½ teaspoons salt\n" +
                    "\n" +
                    "4 bone-in chicken breast halves",
            steps = "Stir together lemon juice, paprika, chili powder, garlic, ginger, and salt in a large bowl until well combined. Add chicken; rub until well coated and marinate in the refrigerator for 3 hours.\n" +
                    "\n" +
                    "Preheat a grill for medium heat and lightly oil the grates.\n" +
                    "\n" +
                    "Place chicken onto the preheated grill; discard marinade. Cook, turning occasionally, until skins are slightly charred and the juices run clear, about 30 minutes. An instant-read thermometer inserted into the center of chicken should read at least 165 degrees F (74 degrees C). ",
            mealImageId = R.drawable.p4
        ),
        Meal(
            id = 5,
            title = "Moroccan Chicken",
            prep = "1hr 5 mins",
            description = "Serves 4",
            ingredients = "1 tbsp olive oil\n" +
                    "\n" +
                    "1 pound skinless, boneless chicken breast meat - cubed\n" +
                    "\n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "1 onion, chopped\n" +
                    "\n" +
                    "2 carrots, sliced\n" +
                    "\n" +
                    "2 stalks celery, sliced\n" +
                    "\n" +
                    "2 cloves garlic, chopped\n" +
                    "\n" +
                    "1 tablespoon minced fresh ginger root\n" +
                    "\n" +
                    "¾ teaspoon ground cumin\n" +
                    "\n" +
                    "½ teaspoon paprika\n" +
                    "\n" +
                    "½ teaspoon dried oregano\n" +
                    "\n" +
                    "¼ teaspoon ground cayenne pepper\n" +
                    "\n" +
                    "¼ teaspoon ground turmeric\n" +
                    "\n" +
                    "1 ½ cups chicken broth\n" +
                    "\n" +
                    "1 cup crushed tomatoes\n" +
                    "\n" +
                    "1 cup canned chickpeas, drained\n" +
                    "\n" +
                    "1 zucchini, sliced\n" +
                    "\n" +
                    "1 tablespoon lemon juice",
            steps = "Heat oil in a large saucepan over medium heat. Add chicken and season with salt. Cook, stirring occasionally, until chicken is partially cooked, 3 to 4 minutes. Transfer to a plate.\n" +
                    "\n" +
                    "Add onion, carrots, celery, and garlic to the saucepan; sauté until tender, 4 to 5 minutes. Stir in ginger, cumin, paprika, oregano, cayenne pepper, and turmeric; sauté until fragrant, about 1 minute. Add broth and tomatoes, then return chicken to the pan. Reduce the heat to low and simmer for 10 minutes.\n" +
                    "\n" +
                    "Stir in chickpeas and zucchini. Return to a simmer, then cover the pan and cook until zucchini is tender, about 15 minutes. Stir in lemon juice and serve.",
            mealImageId = R.drawable.p5
        ),
        Meal(
            id = 6,
            title = "Nigerian Jollof Rice with Chicken and Fried Plantains",
            prep = "ihr 29mins",
            description = "Serves 8",
            ingredients = "2 pounds chicken drumsticks\n" +
                    "\n" +
                    "½ large onion, diced\n" +
                    "\n" +
                    "1 (2 inch) piece fresh ginger root, peeled and thinly sliced\n" +
                    "\n" +
                    "2 cubes chicken bouillon, crushed\n" +
                    "\n" +
                    "2 cloves garlic, diced\n" +
                    "\n" +
                    "1 tablespoon curry powder, or more to taste\n" +
                    "\n" +
                    "1 teaspoon herbes de Provence\n" +
                    "\n" +
                    "freshly ground black pepper\n" +
                    "\n" +
                    "1 pinch cayenne pepper\n" +
                    "\n" +
                    "1 cup water\n" +
                    "\n" +
                    "Rice:\n" +
                    "\n" +
                    "3 tablespoons vegetable oil\n" +
                    "\n" +
                    "½ large onion, diced\n" +
                    "\n" +
                    "1 (14 ounce) can tomato sauce\n" +
                    "\n" +
                    "1 (14 ounce) can coconut milk\n" +
                    "\n" +
                    "1 teaspoon herbes de Provence\n" +
                    "\n" +
                    "1 teaspoon salt, or to taste\n" +
                    "\n" +
                    "½ teaspoon ground black pepper, or to taste\n" +
                    "\n" +
                    "3 cups parboiled rice (such as Uncle Ben's®)\n" +
                    "\n" +
                    "1 (10 ounce) package frozen mixed vegetables (carrots, corn, peas)\n" +
                    "\n" +
                    "Plantains:\n" +
                    "\n" +
                    "4 ripe plantains, peeled and cut diagonally into 1/2-inch slices\n" +
                    "\n" +
                    "½ cup canola oil for frying",
            steps = "Place chicken drumsticks in a large Dutch oven over medium heat. Add 1/2 onion, ginger, crushed bouillon cubes, garlic, curry powder, 1 teaspoon herbes de Provence, black pepper, and cayenne pepper. Mix well. Cook until chicken starts sticking to the bottom, about 5 minutes. Pour in water, mix, cover the pot, and bring to a gentle simmer; cook for 15 minutes. Remove from heat.\n" +
                    "\n" +
                    "Transfer chicken to a baking dish using a slotted spoon. Strain cooking liquid through a fine-mesh sieve. Reserve 1 1/2 cups liquid. Discard solids.\n" +
                    "\n" +
                    "Preheat oven to 400 degrees F (200 degrees C).\n" +
                    "\n" +
                    "Bake chicken in the preheated oven until no longer pink in the middle and the juices run clear, about 30 minutes. An instant-read thermometer inserted into the thickest part should read 165 degrees F (74 degrees C).\n" +
                    "\n" +
                    "Heat 3 tablespoons vegetable oil in a large pot over medium-low heat and cook 1/2 onion until soft and translucent but not browned, about 5 minutes. Add tomato sauce; cook and stir until slightly thickened and infused into the oil, 5 to 7 minutes.\n" +
                    "\n" +
                    "Stir reserved chicken broth, coconut milk, 1 teaspoon herbes de Provence, salt, and pepper into the pot. Bring to a simmer; add rice. Cook, stirring often, until rice is almost tender, 15 to 20 minutes. Add frozen vegetables and continue cooking until rice is tender and creamy, about 5 minutes.\n" +
                    "\n" +
                    "Heat 1/2 cup of canola oil in a nonstick pan over medium heat. Add plantains and fry on both sides until golden and crispy, about 2 to 3 minutes per side. Drain on paper towels. Garnish jollof rice with friend plantains and serve with chicken.",
            mealImageId = R.drawable.p6
        ),
        Meal(
            id = 7,
            title = "African Curry",
            prep = "1hr",
            description = "Serves 8",
            ingredients = "1 tablespoon olive oil\n" +
                    "\n" +
                    "1 onion, chopped\n" +
                    "\n" +
                    "2 cloves garlic, peeled and chopped\n" +
                    "\n" +
                    "1 bay leaf\n" +
                    "\n" +
                    "1 (14.5 ounce) can whole peeled tomatoes, drained\n" +
                    "\n" +
                    "2 teaspoons curry powder\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "1 (2 to 3 pound) whole chicken, bones and skin removed, cut into pieces\n" +
                    "\n" +
                    "1 (14 ounce) can unsweetened coconut milk\n" +
                    "\n" +
                    "1 lemon, juiced",
            steps = "Heat olive oil in a large, heavy skillet over medium heat. Stir in the onion, garlic, and bay leaf, and saute until onion is lightly browned. Mix tomatoes, curry powder, and salt into the skillet, and continue cooking about 5 minutes. Mix in the chicken, and cook 15 to 20 minutes, until no longer pink and juices run clear.\n" +
                    "\n" +
                    "Reduce skillet heat to low. Stirring constantly, gradually blend in the coconut milk over a period of about 10 minutes. Mix in lemon juice just before serving.",
            mealImageId = R.drawable.p7
        ),
        Meal(
            id = 8,
            title = "Doro Wat: Ethiopian Chicken Dish",
            prep = "1hr 37mins",
            description = "Serves 4",
            ingredients = "1 cup butter, divided\n" +
                    "\n" +
                    "1 onion, chopped\n" +
                    "\n" +
                    "2 ½ cups water, divided\n" +
                    "\n" +
                    "1 (6 ounce) can tomato paste\n" +
                    "\n" +
                    "¾ cup berbere seasoning\n" +
                    "\n" +
                    "1 teaspoon chopped garlic\n" +
                    "\n" +
                    "½ teaspoon ground ginger\n" +
                    "\n" +
                    "4 skinless, boneless chicken breasts, cubed\n" +
                    "\n" +
                    "⅓ cup sweet white wine\n" +
                    "\n" +
                    "½ teaspoon ground cardamom\n" +
                    "\n" +
                    "½ teaspoon freshly ground black pepper\n" +
                    "\n" +
                    "4 hard-boiled eggs",
            steps = "Heat 1/2 cup butter in a skillet over medium-low heat. Cook and stir onion until translucent, 5 to 6 minutes. Add 1/2 cup water and tomato paste; stir until hot, about 2 minutes. Stir in remaining butter, berbere, garlic, and ginger. Adjust heat to low and cook until mixture thickens to paste consistency, 20 to 30 minutes.\n" +
                    "\n" +
                    "Stir remaining water into berbere paste; add chicken. Simmer until thickened to sauce consistency, about 45 minutes.\n" +
                    "\n" +
                    "Stir white wine, cardamom, and black pepper into the sauce; add hard-boiled eggs. Cook until sauce is reduced slightly, about 15 minutes more.",
            mealImageId = R.drawable.p8
        )
    )
}