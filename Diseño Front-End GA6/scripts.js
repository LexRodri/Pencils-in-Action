document.addEventListener('DOMContentLoaded', () => {
    console.log('Pencils in Action está listo.');
});

showSection('inicio');

document.addEventListener('DOMContentLoaded', function() {
    // Obtén todas las secciones y los enlaces de navegación
    const sections = document.querySelectorAll('main section');
    const navLinks = document.querySelectorAll('nav ul li a');

    // Función para mostrar una sección y ocultar las demás
    function showSection(id) {
        sections.forEach(section => {
            if (section.id === id) {
                section.classList.remove('hidden');
            } else {
                section.classList.add('hidden');
            }
        });
    }

    // Escuchar los clics en los enlaces de navegación
    navLinks.forEach(link => {
        link.addEventListener('click', function(event) {
            const targetId = this.getAttribute('href').substring(1); // Obtén el ID del destino
            showSection(targetId); // Muestra la sección correspondiente
        });
    });

    // Mostrar solo la sección de "proyectos" al inicio
    showSection('proyectos');
});

