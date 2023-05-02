## Software Architecture
mvvm -> model view viewmodel 
->it is an architectural pattern that facilitates the separation 
of the development of the GUI(view) from the dvpt of the business/back-end logic
->View-Model is responsible for exposing the data objects{variables, for instance} from the model,
in such a way the objects are easily managed and represented.
-> it can also be put as a value converter,
->vm is more model than view and handles the most of the views display logic
-> vm may implement a *mediator pattern* thus organising access to the backend logic
around the set of *use case* supported bt the view

## My simple analogy
-> the mvvm can be related to a music popstar:
*Her fans*(User input) ----> *Popstar*(View) ----> *Manager*(ViewModel) <---->*song*(Model) <----*Record Producer & other agencies*(sevices)

1. the popstar(view) is the face of the whole operation taking place behind the scenes and needs to interact with her fans(thus handles user input)
2. manager: provides info to the popstar eg when the next tour is, what to wear etc(handling view display logic)


## state management
-> it reduces coupling btn components in a system

## Dependency injection
-> a design pattern used in s/ware dev to achieve a maintainable and testable code
-> a technique for managing objects and their relationships in a program.
-> Hilt -> Dagger: simplifies D.I by providing access to annotations and tools that automate the 
creation and management of object & their dependencies

## Demo Dependencies
1. Hilt
2. Dagger
3. Retrofit
4. Kotlin coroutines

## Plugins
1. hilt
2. kapt
