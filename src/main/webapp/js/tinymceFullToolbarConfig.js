tinymce.init({
    selector: "textarea",
    plugins: 'codemirror',
    toolbar: 'undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | code',
    codemirror: {
        indentOnInit: true, // Whether or not to indent code on init.
        path: 'CodeMirror', // Path to CodeMirror distribution
        config: {           // CodeMirror config object
            mode: 'text/x-sh',
            lineNumbers: true
        },
        jsFiles: [          // Additional JS files to load
            'mode/shell/shell.js'
        ]
    }
});
