plugins {
    id("base")
    id("java")
}

repositories {
    jcenter()
}

tasks.create<Copy>("copy") {
    description = "Copies sources to the dest directory"
    group = "Custom"

    from("src")
    into("dest")
}

tasks.create<Zip>("zip") {
    description = "Archives sources in a zip file"
    group = "Archive"

    from("src")
    setArchiveName("basic-demo-1.0.zip")
}

dependencies {
    implementation("com.google.guava:guava:26.0-jre")

    testImplementation("junit:junit:4.12")
}
